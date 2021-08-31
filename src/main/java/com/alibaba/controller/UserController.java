package com.alibaba.controller;

import com.alibaba.bean.Result;
import com.alibaba.bean.User;
import com.alibaba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    public String regist(User user) {
        Result result = new Result();
        result = userService.regist(user);
        if (result.getSuccess().equals("1")) {
            return "注册成功";
        }
        if (result.getSuccess().equals("0")) {
            return "注册失败,用户名已存在";
        }
        return null;
    }


    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    public String login(User user){
        Result result = new Result();
        result = userService.login(user);
        if (result.getSuccess().equals("1")) {
            return "登录成功";
        }
        if (result.getSuccess().equals("0")) {
            return "登录失败,用户名或密码错误";
        }
        return null;
    }
}

