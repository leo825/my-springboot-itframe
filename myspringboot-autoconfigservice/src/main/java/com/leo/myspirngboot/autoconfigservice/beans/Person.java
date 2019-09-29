package com.leo.myspirngboot.autoconfigservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Person
 * @Description Person
 * @Author stack
 * @Version 1.0
 * @since 2019/6/27 17:33
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}
