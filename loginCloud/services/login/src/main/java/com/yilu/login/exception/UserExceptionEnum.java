package com.yilu.login.exception;



public enum UserExceptionEnum {

    REGISTER_FAIL("用户名已存在","400"),
    LOGIN_FAIL("用户名或密码错误","401"),
    NOT_REGISTER("此用户名尚未注册","401")
    ;


    private String msg;

    private String code;

    private UserExceptionEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }
   public String getCode() {
        return code;
   }

}
