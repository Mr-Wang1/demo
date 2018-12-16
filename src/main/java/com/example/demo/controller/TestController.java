package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixin.wang
 * @date 2018/12/16 19:27
 * @description:
 */
@RestController
public class TestController {

    @RequestMapping(value="/test")
    public String test(){
        return "hello world!";
    }
}
