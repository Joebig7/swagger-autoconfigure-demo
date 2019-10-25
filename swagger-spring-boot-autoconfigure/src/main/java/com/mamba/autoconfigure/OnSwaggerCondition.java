package com.mamba.autoconfigure;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/25 14:29
 * @description Swagger属性条件类
 */
public class OnSwaggerCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String basePackage = context.getEnvironment().getProperty("swagger.basePackage");
        if (Objects.isNull(basePackage)) {
            throw new RuntimeException("please config basePackage first");
        } else {
            return true;
        }
    }
}