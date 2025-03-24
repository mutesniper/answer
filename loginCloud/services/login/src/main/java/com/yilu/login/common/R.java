package com.yilu.login.common;




public class R {
    private boolean flag;
    private String msg;
    private String code;
    private String data;
    public R() {}

    public boolean isFlag() {
        return flag;
    }
    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }
    public String getData() {
        return data;
    }
    public static R ok(String msg,String code,String data) {
        R r = new R();
        r.flag = true;
        r.msg = msg;
        r.code = code;
        r.data = data;
        return r;
    }
    public static R ok(String msg,String code) {
        return ok(msg,code,null);
    }

    public static R error(String msg,String code,String data) {
        R r = new R();
        r.flag = false;
        r.msg = msg;
        r.code = code;
        r.data = data;
        return r;
    }
    public static R error(String msg,String code) {
        return error(msg,code,null);
    }


}
