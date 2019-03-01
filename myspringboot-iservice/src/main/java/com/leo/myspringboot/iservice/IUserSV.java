package com.leo.myspringboot.iservice;

import com.leo.myspringboot.beans.User;

/**
 * Created by Administrator on 2019/2/26.
 */
public interface IUserSV {
    public User findUser(String name);
}
