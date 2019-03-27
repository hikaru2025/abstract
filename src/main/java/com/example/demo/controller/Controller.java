package com.example.demo.controller;

import com.example.demo.test.TTT;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiemin
 * @date 2019/3/27 11:35
 */
public class Controller {

    @Autowired
    private static TTT tt;


    public static void wa() {
        System.out.println(tt.hhe());
    }

    public static void main(String[] args) {

        wa();

    }
}
