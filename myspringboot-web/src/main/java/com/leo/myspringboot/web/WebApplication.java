package com.leo.myspringboot.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/3/1.
 */
/**
 * 该注解指定项目为springboot，由此类当作程序入口
 * 自动装配 web 依赖的环境
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = {"com.leo.myspringboot"})//@ComponentScan是组件扫描注解，用来扫描@Controller  @Service  @Repository这类,主要就是定义扫描的路径从中找出标志了需要装配的类到Spring容器中
public class WebApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(WebApplication.class, args);
    }
}
