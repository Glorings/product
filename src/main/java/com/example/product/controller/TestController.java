package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wujun
 * @version 1.0.0
 * @description:
 * @date 2019-07-05 09:42
 * Copyright 本内容仅限于浙江名信信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class TestController {

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
        return "SUCCESS";
    };

}
