package com.alibaba.bean;

import lombok.Data;
import lombok.ToString;

/**
 * 向前端返回信息封装
 * @param <T> 可变类型
 */
@Data
@ToString
public class Result<T> {
    private String msg;//返回信息
    private String success;//数据是否正常请求
    private T detail;//具体返回的数据
}
