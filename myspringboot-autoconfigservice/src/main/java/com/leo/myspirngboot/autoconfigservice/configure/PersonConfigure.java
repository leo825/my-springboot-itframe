package com.leo.myspirngboot.autoconfigservice.configure;

import com.leo.myspirngboot.autoconfigservice.beans.Person;
import com.leo.myspirngboot.autoconfigservice.condition.FalseCondition;
import com.leo.myspirngboot.autoconfigservice.condition.TrueCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: PersonConfigure
 * @Description: ${description}
 * @Author: leo825
 * @Date: 2019-09-27 15:27
 * @Version: 1.0
 */
@Configuration
public class PersonConfigure {

    @Bean(name = "person1")
    @Conditional({TrueCondition.class})
    public Person person1() {
        System.out.println("我是person1");
        return new Person("zhangsan", 11);
    }

    @Bean(name = "person2")
    @Conditional({FalseCondition.class})
    public Person person2() {
        System.out.println("我是person2");
        return new Person("lisi", 22);
    }
}
