package com.lianshidai.api.bean;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * 
 * @TableName user
 */
@Data
public class User {

    @NotBlank(message = "姓名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

}
