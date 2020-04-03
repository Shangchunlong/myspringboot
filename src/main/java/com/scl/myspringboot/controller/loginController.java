package com.scl.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangchunlong
 * @create 2020-03-03 10:48
 */
@RestController
public class loginController {
    @GetMapping("/login")
    public String login() {
        return "index999";
    }
}
