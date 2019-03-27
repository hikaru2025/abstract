package com.example.demo.test;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xiemin
 * @date 2019/3/27 11:33
 */
public abstract class Test01 {

    @Autowired
    protected UserService userService;



    public String hhe() {
        return userService.hello();
    }

    public abstract String  ll();
}
