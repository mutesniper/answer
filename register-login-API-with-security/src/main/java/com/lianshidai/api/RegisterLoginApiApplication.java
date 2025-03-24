package com.lianshidai.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lianshidai.api.mapper")
@SpringBootApplication
public class RegisterLoginApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterLoginApiApplication.class, args);
    }

}
