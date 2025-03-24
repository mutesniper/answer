package com.lianshidai.api.common;


import lombok.Data;
//统一返回R对象
@Data
public class R {

    private Integer code;
    private String msg;
    private Object data;

    public static R ok(Object data) {
        R r = new R();
        r.setCode(200);
        r.setData(data);
        r.setMsg("ok");
        return r;
    }

    public static R ok() {
        return ok(null);
    }

    public static R error() {
        R r = new R();
        r.setCode(500);
        r.setMsg("error");
        return r;
    }

    public static R error(String msg,Integer code) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static R error(String msg,Integer code,Object data) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }








}
