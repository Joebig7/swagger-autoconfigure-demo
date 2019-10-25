# Swagger-Spring-Boot-Starter 创建
本项目是针对Swagger创建的一个可以自动装配的SpringBoot Starter，分为如下几个部分：
- swagger-spring-boot-autoconfigure ：存放了自动配置相关的代码
- swagger-spring-boot-starter ：最终使用的starter项目，包含了所有的依赖关系
- swagger-app：测试案例

## 运行步骤
1. `git clone git@github.com:Joebig7/swagger-autoconfigure-demo.git` 将代码拷贝下来。
2.  运行`mvn -Dmaven.test.skip=true clean install` 将swagger-spring-boot-starter发布到本地仓库
3.  maven依赖
```
<dependency>
    <groupId>com.mamba</groupId>
    <artifactId>swagger-spring-boot-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## 扩展
关于SpringBoot指定Starter可以参见本片文章[传送门](https://www.zjfzjf.com/2019/10/25/2019_10_25_springboot-creating-starter/)