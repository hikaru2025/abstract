package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author xiemin
 * @date 2019/3/27 11:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello() {
        return "hello world";
    }
}
