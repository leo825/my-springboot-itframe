package com.leo.myspringboot.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leo.myspringboot.beans.User;

import com.leo.myspringboot.iservice.IUserSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/28.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference(version = "1.0.0")
    IUserSV userSV;

    private final Logger logger = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "/helloworld", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloworld() {
        return "helloworld";
    }

    @RequestMapping(value = "/helloworld2/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloworld2(@PathVariable("name") String name) {
        User user = userSV.findUser(name);
        return user.getName();
    }

    @RequestMapping(value = "/helloworld3", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloworld3() {
        return "<h1>helloworld</h1>";
    }

//    @RequestMapping(value = "/helloworld4", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String helloworld4(@RequestBody User student) {
//        logger.info("helloworld4方法体开始执行。。。");
//        String userString = null;
//        try {
//            logger.info(JSON.toJSONString(student));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        logger.info("helloworld4方法体结束执行。。。");
//        return userString;
//    }


}
