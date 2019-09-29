package com.leo.myspirngboot.autoconfigservice.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
* @ClassName: TrueCondition
* @Description: 如果条件是true
* @Author: leo825
* @Date: 2019-09-27 14:49
* @Version: 1.0
*/
public class TrueCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
