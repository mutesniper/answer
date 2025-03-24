package com.lianshidai.api.advice;

import com.lianshidai.api.common.R;
import com.lianshidai.api.exception.UserException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserException.class)
    public R error(UserException e) {
        return R.error(e.getMsg(),e.getCode());
    }

    @ExceptionHandler(Throwable.class)
    public R error(Throwable e) {
        return R.error(e.getMessage(),500);
    }


}
