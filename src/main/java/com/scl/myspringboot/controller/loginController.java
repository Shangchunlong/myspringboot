package com.scl.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangchunlong
 * @create 2020-03-03 10:48
 */
@RestController
public class loginController {
    @RequestMapping(value = "/login")
    public  String  login(){
        return "index999";
    }
}
