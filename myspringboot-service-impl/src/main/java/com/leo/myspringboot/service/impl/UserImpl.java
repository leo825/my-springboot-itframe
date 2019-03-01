package com.leo.myspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.User;
import com.leo.myspringboot.iservice.IUserSV;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/26.
 */
@Service(version = "1.0.0")
public class UserImpl implements IUserSV {
    @Override
    public User findUser(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }
}
