package com.yilu.login.controller;


import com.yilu.login.bean.User;
import com.yilu.login.common.R;
import com.yilu.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/login")
    public R login(@RequestBody User user) {
        userService.login(user.getUsername(), user.getPassword());
        return R.ok("登陆成功","200");
    }
    @PostMapping("/register")
    public R register(@RequestBody User user) {
        userService.register(user.getUsername(), user.getPassword());
        return R.ok("注册成功","200");
    }




}
