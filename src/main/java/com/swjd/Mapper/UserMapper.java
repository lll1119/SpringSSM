package com.swjd.Mapper;

import com.swjd.bean.User;

public interface UserMapper {
    public abstract User findUserByUnamePwd(User user);
}
