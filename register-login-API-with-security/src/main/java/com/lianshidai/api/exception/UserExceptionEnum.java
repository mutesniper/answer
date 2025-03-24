package com.lianshidai.api.exception;

import lombok.Getter;

public enum UserExceptionEnum {

    REGISTER_FAIL("用户名已存在",400),
    LOGIN_FAIL("用户名或密码错误",401),
    NOT_REGISTER("此用户名尚未注册",401)
    ;

    @Getter
    private String msg;
    @Getter
    private Integer code;

    private UserExceptionEnum(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }



}
