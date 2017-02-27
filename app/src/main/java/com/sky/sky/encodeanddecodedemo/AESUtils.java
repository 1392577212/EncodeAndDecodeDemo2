package com.sky.sky.encodeanddecodedemo;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by BlueSky on 16/12/28.
 *
 * DES很容易被破解，64位的块加密

 * AES是对DES的加强版本,128位的块加密，
 */

public class AESUtils {

    /**
     * 根据指定字符串 信息得到秘要Key
     *
     * @param key
     * @return
     */
    public static Key generateKey(byte[] key) {
        try {

            //秘钥生成器对象
            KeyGenerator keyGenerator =KeyGenerator.getInstance("AES");

            //生成随机数据源
            /**
             *
             * AES:
             * java:
             * SecureRandom secureRandom = new SecureRandom();
             * 正确
             * 不需要二进制和十六进制转化
             *
             * android:在Android系统中必须使用如下操作，操作系统多样化，要进行兼容(原因：Crypto包，在android4.0之后有一个，jdk也有一个)
             *  SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
                secureRandom.setSeed(key);
             *   需要二进制和十六进制转化
             */
            /**
             * SHA1:数字签名使用的算法
             * RNG:生成随机数据
             * P:(pseudo:伪,)
             *
             * SHA1PRNG:使用SHA1签名算法生成伪随机数
             * 参数2;Crypto表示加密解密类所在的包名
             *
             *
             * 整体描述:使用Crypto包中的加密解密类结合SHA1签名算法生成伪随机数
             *
             */
           //使用Crypto包中的加密解密类结合SHA1签名算法生成伪随机数，初始化对象
             SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
             //设置生成随机数的种子，范围，指定确定的数据在该范围生成一个伪随机数
             secureRandom.setSeed(key);
             //初始化，参数1:秘要大小
             keyGenerator.init(128,secureRandom);
             //生成秘钥
             SecretKey key1 = keyGenerator.generateKey();
             /**
             * 参数1:秘钥的字节数组类型(根据KeyGenerator生成SecretKey，在根据SecretKey的getEncoded()转化得到字节数组)
             */
            //根据AES的算法得到秘要的字节数组,在使用AES算法得到秘要Key
            SecretKeySpec secretKeySpec =new SecretKeySpec(key1.getEncoded(),"AES");
            return secretKeySpec;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    /**
     * des加密
     *
     * @param key:加密需要用到的秘钥字符串
     * @param data:加密的数据字符串
     */
    public static byte[] encrptDataByAES(byte[] key, byte[] data) {
        try {
            //1.获得加密解密类的对象
            Cipher cipher = Cipher.getInstance("AES");
            /**
             * 参数1:加密解密的模式类型
             * 参数2:加密解密用的秘钥,DES 秘钥
             */
            cipher.init(Cipher.ENCRYPT_MODE, generateKey(key));
            //3.做真正的操作
            byte[] bytes = cipher.doFinal(data);
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * des解密
     *
     * @param key:解密的秘钥字符串
     * @param data:加密过后的字符串
     */
    public static byte[] decrptDataByDES(byte[] key, byte[] data) {
        try {
            //获取解密类的对象
            Cipher cipher = Cipher.getInstance("AES");
            /**
             * 参数1:加密解密的模式类型
             * 参数2:加密解密用的秘钥,DES 秘钥
             */
            cipher.init(Cipher.DECRYPT_MODE, generateKey(key));
            //解密的动作
            byte[] bytes = cipher.doFinal(data);
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
