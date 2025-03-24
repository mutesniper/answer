package com.yilu.login.mapper;

import com.yilu.login.bean.User;

/**
* @author 14693
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-03-23 11:30:01
* @Entity com.yilu.login.bean.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
