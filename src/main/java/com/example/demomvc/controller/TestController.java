package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        System.out.println("inside test controller ");

        String redirectUrl = "https://www.paisabazaar.com/";
        return "redirect:" + redirectUrl;

        //return "index";
    }
}
