package com.leo.myspringboot.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by Administrator on 2019/2/26.
 */

/**
 * 该注解指定项目为springboot，由此类当作程序入口
 * 自动装配 web 依赖的环境
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.leo.myspringboot.dao"})
@EnableTransactionManagement
@EnableCaching
public class ServiceApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
