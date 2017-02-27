package com.sky.sky.encodeanddecodedemo;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * Created by BlueSky on 16/12/28.
 */

public class DESUtils {

    /**
     * 根据指定字符串 信息得到秘要Key
     *
     * @param key
     * @return
     */
    public static Key generateKey(byte[] key) {
        try {
            /**
             * 生成秘钥
             * 1.先根据指定算法得到秘钥工厂类的对象
             * 2.根据秘钥工厂类的对象的generateSecret()生成指定秘钥
             */
            //1.先根据指定算法得到秘钥工厂类的对象
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
            //使用DES秘钥描述类去生成描述
            DESKeySpec spec = new DESKeySpec(key);
            //2.根据秘钥工厂类的对象的generateSecret(参数秘钥的描述对象)生成指定秘钥
            //备注：generateSecret()返回值为SecretKey,但是SecretKey是Key的子类，我们加密需要的是Key,下面进行向上转型
            Key key1 = factory.generateSecret(spec);
            return key1;
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
    public static byte[] encrptDataByDES(byte[] key, byte[] data) {
        try {
            //1.获得加密解密类的对象
            Cipher cipher = Cipher.getInstance("DES");
            //2.初始化
            SecureRandom secureRandom = new SecureRandom();
            /**
             * 参数1:加密解密的模式类型
             * 参数2:加密解密用的秘钥,DES 秘钥
             * 参数3:随机数的源
             */
            cipher.init(Cipher.ENCRYPT_MODE, generateKey(key), secureRandom);
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
            Cipher cipher = Cipher.getInstance("DES");
            //初始化
            SecureRandom random = new SecureRandom();
            /**
             * 参数1:加密解密的模式类型
             * 参数2:加密解密用的秘钥,DES 秘钥
             * 参数3:随机数的源
             */
            cipher.init(Cipher.DECRYPT_MODE, generateKey(key), random);
            //解密的动作
            byte[] bytes = cipher.doFinal(data);
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
