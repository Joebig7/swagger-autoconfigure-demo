package com.mamba.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/25 10:27
 * @description Swagger主动注入类
 */

@Configuration
@SwaggerCondition
@ConditionalOnProperty(name = "swagger.enabled", matchIfMissing = true)
@ConditionalOnClass(name = {"javax.servlet.ServletRegistration", "springfox.documentation.spring.web.plugins.Docket"})
@EnableConfigurationProperties(SwaggerProperties.class)
public class SwaggerAutoConfiguration {


    private SwaggerProperties swaggerProperties;

    public SwaggerAutoConfiguration(SwaggerProperties swaggerProperties) {
        this.swaggerProperties = swaggerProperties;
    }

    @ConditionalOnMissingBean(Docket.class)
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(this.swaggerProperties.getBasePackage()))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(this.swaggerProperties.getTitle())
                .description(this.swaggerProperties.getDescription())
                .termsOfServiceUrl(this.swaggerProperties.getUrl())
                .contact(this.swaggerProperties.getContact())
                .version(this.swaggerProperties.getVersion())
                .build();
    }
}