package com.sky.sky.encodeanddecodedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import static com.sky.sky.encodeanddecodedemo.Utils.parseHexStr2Byte;


/**
 * 1.URLEncoder和URLDecoder只针对于汉字的编码和解码(表现形式:编码后结果大概的样子:里面含有的％以及十六进制内的字符)
 * 2.Base64针对所有的字符串都可以编码和解码,备注如下：
 * 1>Base64默认模式Padding:如果字符长度不够，末尾进行补位,一般是补位的是"=="
 * 2>Base64的模式：NO_PADDING:如果字符长度不够，末尾不进行补位
 * <p>
 * <p>
 * 加密解密：
 * 1.对称加密：加密和解密使用同一个秘钥,DES,AES ，过程可逆
 * DES(Data Encryption Standard:数据加密标准，IBM公司):加密解密使用块算法：
 * <p>
 * 加密解密的类：Cipher:加密解密的类
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 2.非对称加密：加密和解密使用一对秘钥(公钥和私钥) RSA
 */
public class MainActivity extends AppCompatActivity {

    String key = "12345678";
    String data = "哈哈嘿嘿嘻嘻呵呵";
    //tring data="asdfgdfgsf3242346453646745687586578657sgdhghyjrh";
    String encodeStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void encode(View view) {
        //URLEncoder编码
        /**
         * 参数1:需要被编码的字符串数据
         * 参数2:字符集编码
         */
        try {
            encodeStr = URLEncoder.encode(data, "utf-8");
            Log.e("======", "===URLEncoder编码后的结果是：===" + encodeStr);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    public void decode(View view) {
        //URLDecoder解码
        /**
         * 参数1:需要被解码的字符串数据
         * 参数2:字符集编码
         */
        try {
            String decodeStr = URLDecoder.decode(encodeStr, "utf-8");
            Log.e("======", "===URLDecoder解码后的结果是：===" + decodeStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    //8个字节
    public void base64(View view) {
        //编码：返回结果为byte[]
        /**
         * 参数1:需要编码的字符串，但是需要转化成字节数组
         * 参数2:确认结果输出的标记flags(DEFAUTT)
         */
        byte[] bytes = Base64.encode(data.getBytes(), Base64.DEFAULT);
        String encodeBase64Str = new String(bytes);
        Log.e("=====", "=====第一种编码方式得到的结果是：===" + encodeBase64Str);

        //编码;返回结果为string
        String str = Base64.encodeToString(data.getBytes(Charset.forName("utf-8")), Base64.DEFAULT);
        Log.e("=====", "=====第二种编码方式得到的结果是：===" + str);

        byte[] decodeBytes = Base64.decode(str, Base64.DEFAULT);
        String decodestr = new String(decodeBytes, Charset.forName("utf-8"));
        Log.e("=====", "=====第一种解码方式得到的结果是：===" + decodestr);

    }

    public void md5(View view) {
        //信息摘要,过程不可逆，只能编码不能解码
        /**
         *
         * md5一般结合Base64完成
         * 通过md5算法把任意大小的数据转化成固定长度hash code(内存地址或者字符串或者数字经过计算得到int数组)值
         */
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(data.getBytes());
            String str = Base64.encodeToString(bytes, Base64.NO_PADDING);
            Log.e("=====", "=====第md5加密Base46编码方式得到的结果是：===" + str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    //对称加密 56位
    public void des(View view) {
        //加密(返回字节数组内容为二进制内容)
        //参数2:普通字符串进行转化得到字节数组
        //返回值:使用des的块加密算法计算得到的二进制字节数组
        byte[] bytes = DESUtils.encrptDataByDES(key.getBytes(), data.getBytes());
        //进行转化，二进制到十六进制
        String str = Utils.parseByte2HexStr(bytes);
        //使用此种方式结果谁都不识别,解密时候出现空指针，这种方式直接成错误
        Log.e("====", "==des加密后的二进制结果:" + new String(bytes));
        //此种方式正确
        Log.e("====", "==des加密后的十六进制结果:" + str);

        //对解密结果进行转化，十六进制到二进制
        byte[] b1 = parseHexStr2Byte(str);
        //解密，解密返回的结果就是普通的字节数组
        byte[] b = DESUtils.decrptDataByDES(key.getBytes(), b1);
        Log.e("====", "==des解密后的结果:" + new String(b));
    }
    //对称加密 128为
    public void aes(View view) {
        byte[] bytes = AESUtils.encrptDataByAES(key.getBytes(), data.getBytes());
        //进行转化，二进制到十六进制
        String str = Utils.parseByte2HexStr(bytes);
        Log.e("====", "==aes加密后的结果:" + str);

        //对解密结果进行转化，十六进制到二进制
        byte[] b1 = parseHexStr2Byte(str);
        byte[] bytes1 = AESUtils.decrptDataByDES(key.getBytes(), b1);
        Log.e("====", "==aes加密后的结果:" + new String(bytes1));

    }
    //非对称加密，公钥，私钥
    public void rsa(View view) {
        //生成一对秘要
        try {
            Map<String, Object> map = RSAUtils.genKeyPair();
            Key publicKey = (Key) map.get(RSAUtils.PUBLIC_KEY);
            Key privatekey = (Key) map.get(RSAUtils.PRIVATE_KEY);

            //用公钥加密
            byte[] bytes = RSAUtils.encrypt(publicKey, data.getBytes());
            String s = Utils.parseByte2HexStr(bytes);

            Log.e("======", "===rsa加密结果===" + s);
            byte[] b1 = Utils.parseHexStr2Byte(s);
            byte[] b = RSAUtils.decrypt(privatekey, b1);

            Log.e("======", "===rsa解密结果===" + new String(b));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
