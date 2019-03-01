package com.leo.myspringboot.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/20.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
