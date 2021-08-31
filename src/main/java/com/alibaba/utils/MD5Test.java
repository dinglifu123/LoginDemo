package com.alibaba.utils;

/**
 * @author dlf
 * @description
 * @date 2021/8/26 0026
 */
public class MD5Test {
    public static void main(String[] args) {
        MD5Utils md5Utils = new MD5Utils();
        System.out.println(md5Utils.string2Md5_16("123456"));
    }
}
