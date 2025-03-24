package com.yilu.login.controller;



import com.yilu.login.bean.User;
import com.yilu.login.common.R;
import com.yilu.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody User user) {
        R r=userService.login(user);
        return r;
    }
}
