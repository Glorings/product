package com.example.product.controller;


import com.alibaba.fastjson.JSON;
import com.example.product.service.bo.UserBo;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


/**
 * @author wujun
 * @version 1.0.0
 * @description:
 * @date 2019-07-05 09:42
 * Copyright 本内容仅限于浙江名信信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class TestController {
    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/product/{userId}")
    public  String getProduc(@PathVariable("userId") Long userId){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    };

    @GetMapping("/product2/{userId}")
    public  String getProduc2(@PathVariable("userId") Long userId){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    };

    @GetMapping("/product/test")
    public  String test(){
        String str = Base64.encodeBase64String("Glorings:123456".getBytes());
        logger.info(str);
        return "SUCCESS";
    };

    @GetMapping("/productParamGet")
    public  String productParamGet(UserBo user){
        logger.info(JSON.toJSONString(user));
        return "AAAA";
    }

    @PostMapping("/productParamPost")
    public  String productParamPost(@RequestBody UserBo user){
        logger.info(JSON.toJSONString(user));
        return "BBBB";
    }

}
