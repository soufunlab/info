package com.ratel.info.impl.api.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 2018-1-3 17:55 by 李浩（lihao@cloud-young.com）创建
 */
public class Md5Util {

    /**
     * 字符串md5
     *
     * @param message
     * @return
     */
    public static String encode(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        String result = base64en.encode(md5.digest(message.getBytes("utf-8")));
        return result;

    }
}
