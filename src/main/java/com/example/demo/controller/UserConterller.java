package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiemin
 * @date 2019/3/27 16:57
 */
@RestController
public class UserConterller {

    @RequestMapping("/hello")
    public String liest() {
        return "hello world";
    }
}
