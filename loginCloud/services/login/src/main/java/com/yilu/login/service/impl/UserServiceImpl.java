package com.yilu.login.service.impl;

import com.yilu.login.bean.User;
import com.yilu.login.exception.UserException;
import com.yilu.login.exception.UserExceptionEnum;
import com.yilu.login.mapper.UserMapper;
import com.yilu.login.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if(user == null){
            throw new UserException(UserExceptionEnum.NOT_REGISTER);
        }

        if(!BCrypt.checkpw(password, user.getPassword())){
            throw new UserException(UserExceptionEnum.LOGIN_FAIL);
        }

    }

    @Override
    public void register(String username, String password) {
        User user=userMapper.selectByUsername(username);
        if(user != null){
            throw new UserException(UserExceptionEnum.REGISTER_FAIL);
        }
        user=new User();
        String pw=BCrypt.hashpw(password, BCrypt.gensalt());
        user.setPassword(pw);
        user.setUsername(username);
        userMapper.insert(user);

    }
}
