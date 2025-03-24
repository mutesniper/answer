package com.lianshidai.api.controller;

import com.lianshidai.api.bean.User;
import com.lianshidai.api.common.R;
import com.lianshidai.api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public R login(@RequestBody @Valid User user) {
        userService.login(user.getUsername(), user.getPassword());
        return R.ok();

    }
    @PostMapping("/register")
    public R register(@RequestBody @Valid User user) {
        userService.register(user.getUsername(), user.getPassword());
        return R.ok();
    }

}
