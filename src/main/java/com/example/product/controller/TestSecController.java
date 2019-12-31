package com.example.product.controller;


import com.alibaba.fastjson.JSON;
import com.example.product.service.bo.UserBo;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


/**
 * @author wujun
 * @version 1.0.0
 * @description:
 * @date 2019-07-05 09:42
 * Copyright 本内容仅限于浙江名信信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
@RefreshScope
public class TestSecController {
    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${name}")
    private String testKey;

    @GetMapping("/testKey")
    public  String rateLimit(){
        return testKey;
    };

    @PostMapping("/testTokenSec")
    public  String testToken(@RequestHeader("token") String header){
        logger.info(header);
        return "CCC";
    };

}
