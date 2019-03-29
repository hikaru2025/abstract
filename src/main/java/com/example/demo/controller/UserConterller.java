package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**松岛枫松岛枫
 * @author xiemin围绕丰富
 * @date 2019/3/27 16:57
 */
@RestController
public class UserConterller {
//1
    @RequestMapping("/hello")
    public String liest() {
        return "hello world";
    }
}
