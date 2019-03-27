package com.example.demo.test;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xiemin
 * @date 2019/3/27 11:37
 */
@Component
public class TTT extends Test01 {


    @Override
    public String ll() {
        return userService.hello();
    }
}
