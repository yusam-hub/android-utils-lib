package com.github.yusam_hub.android_utils_lib.helpers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Helper {
    public static String md5(String value)
    {
        try {

            MessageDigest mdEnc = MessageDigest.getInstance("MD5");

            mdEnc.update(value.getBytes(), 0, value.length());

            String md5 = new BigInteger(1, mdEnc.digest()).toString(16);

            while ( md5.length() < 32 ) {
                md5 = "0" + md5;
            }

            return md5;

        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
