package com.lianshidai.api.exception;

import lombok.Getter;

public class UserException extends RuntimeException {
  @Getter
  private Integer code;
  @Getter
  private String msg;


  public UserException(UserExceptionEnum exceptionEnum) {
      super(exceptionEnum.getMsg());
      this.code = exceptionEnum.getCode();
      this.msg = exceptionEnum.getMsg();
  }
}
