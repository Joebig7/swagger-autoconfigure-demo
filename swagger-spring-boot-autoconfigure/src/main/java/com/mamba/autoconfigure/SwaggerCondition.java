package com.mamba.autoconfigure;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/25 14:14
 * @description 开启Swagger属性判断注解定义
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSwaggerCondition.class)
public @interface SwaggerCondition {
}