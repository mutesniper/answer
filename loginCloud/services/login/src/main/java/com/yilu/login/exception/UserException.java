package com.yilu.login.exception;



public class UserException extends RuntimeException {

    private String msg;

    private String code;


    public UserException(UserExceptionEnum userExceptionEunm) {

        super(userExceptionEunm.getMsg());
        this.msg = userExceptionEunm.getMsg();
        this.code=userExceptionEunm.getCode();
    }

    public String getMsg() {
        return msg;
    }
    public String getCode() {
        return code;
    }
}
