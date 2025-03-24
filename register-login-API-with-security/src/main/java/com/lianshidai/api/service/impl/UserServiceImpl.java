package com.lianshidai.api.service.impl;

import com.lianshidai.api.bean.User;
import com.lianshidai.api.exception.UserException;
import com.lianshidai.api.exception.UserExceptionEnum;
import com.lianshidai.api.mapper.UserMapper;
import com.lianshidai.api.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void login(String username, String password) {
        User user=userMapper.search(username);
        if(user==null){
            throw new UserException(UserExceptionEnum.NOT_REGISTER);
        }
        if(!BCrypt.checkpw(password, user.getPassword())){
            throw new UserException(UserExceptionEnum.LOGIN_FAIL);
        }
    }

    @Override
    public void register(String username, String password) {
        User user=userMapper.search(username);
        if(user!=null){
            throw new UserException(UserExceptionEnum.REGISTER_FAIL);
        }
        user=new User();
        String pw= BCrypt.hashpw(password, BCrypt.gensalt());
        user.setUsername(username);
        user.setPassword(pw);
        userMapper.insert(user);
    }
}
