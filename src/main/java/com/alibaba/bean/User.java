package com.alibaba.bean;

import lombok.Data;
import lombok.ToString;

/**
 * 用户信息
 */
@Data
@ToString
public class User {
    private Long id;//用户id
    private String username;//用户名
    public String password;//密码
}
