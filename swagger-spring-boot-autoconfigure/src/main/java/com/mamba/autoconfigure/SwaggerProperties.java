package com.mamba.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/25 10:38
 * @description Swagger属性定义
 */
@ConfigurationProperties(prefix = "swagger")
@EnableSwagger2
public class SwaggerProperties {

    /**
     * swagger scan package
     */
    private String basePackage;

    /**
     * swagger document title
     */
    private String title = "API";

    /**
     * swagger document description
     */
    private String description;

    /**
     * swagger document access link
     */
    private String url;

    /**
     * swagger document's contact
     */
    private String contact = "JoeBig7";

    /**
     * swagger version
     */
    private String version = "1.0";

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}