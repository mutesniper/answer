package com.yilu.login.service.impl;

import com.yilu.login.bean.User;
import com.yilu.login.common.R;
import com.yilu.login.mapper.UserMapper;
import com.yilu.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public R login(User user) {
        R r=new R();
        String username = user.getUsername();
        String password = user.getPassword();
        User user1 = userMapper.selectByUsername(username);
        if (user1 != null) {
            if (user1.getPassword().equals(password)) {
                r.setCode(200);
                r.setMsg("登陆成功");
            } else {
                r.setCode(404);
                r.setMsg("登陆失败");
            }
        } else {
            int insert = userMapper.insertSelective(user);
            if (insert > 0) {
                r.setCode(200);
                r.setMsg("注册成功");
            } else {
                r.setCode(404);
                r.setMsg("注册失败");
            }
        }
        return r;


    }
}
