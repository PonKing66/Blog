package com.ponking.blog.util;/*
@author Ponking
@date 2019/12/9--17:36
*/

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    public static String code(String str){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] bytesDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for(int offset = 0;offset<bytesDigest.length;offset++){
                i = bytesDigest[offset];
                if(i<0) i+=256;
                if(i<16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(code("root"));
    }
}
