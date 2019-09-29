package com.leo.myspirngboot.autoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: AutoConfigServiceApplication
 * @Description: ${description}
 * @Author: leo825
 * @Date: 2019-09-27 15:25
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {})
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PersonConfigure.class}))
@ComponentScan
public class AutoConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoConfigServiceApplication.class, args);
    }
}
