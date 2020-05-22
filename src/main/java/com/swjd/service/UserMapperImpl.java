package com.swjd.service;

import com.swjd.Mapper.UserMapper;
import com.swjd.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.findUserByUnamePwd(user);
    }
}
