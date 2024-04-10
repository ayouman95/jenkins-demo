package com.liadbiz.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ayouman
 * @date: 2024/4/10 15:43
 */
@RestController
@RequestMapping("/hello")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
