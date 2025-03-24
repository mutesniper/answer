package com.lianshidai.api.mapper;

import com.lianshidai.api.bean.User;

/**
* @author 14693
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-03-13 14:39:55
* @Entity com.lianshidai.api.bean.User
*/
public interface UserMapper {


    int insert(User record);

    User search(String username);


    User selectByUsername(String username);

}
