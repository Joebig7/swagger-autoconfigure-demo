package com.mamba.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/25 11:31
 * @description
 */

@RestController
@Api(value = "Api", tags = "Api")
public class HelloController {

    @ApiOperation(value = "测试", notes = "测试 ")
    @GetMapping("/hello")
    public String test() {
        return "hello";
    }

}