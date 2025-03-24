package com.yilu.login.advice;


import com.yilu.login.common.R;
import com.yilu.login.exception.UserException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserException.class)
    public R error(UserException e){
        return R.error(e.getMsg(), e.getCode());

    }
    @ExceptionHandler(Throwable.class)
    public R error(Throwable e){
        return R.error(e.getMessage(),"500");
    }





}
