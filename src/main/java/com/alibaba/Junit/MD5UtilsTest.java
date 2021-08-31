package com.alibaba.Junit;

import com.alibaba.utils.MD5Utils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author dlf
 * @description
 * @date 2021/8/26 0026
 */
public class MD5UtilsTest {
    @Test
    public void TestString2Md5(){
        MD5Utils md5Utils = new MD5Utils();
        String md5 = md5Utils.string2Md5_16("123456789");
        System.out.println(md5);
    }
}