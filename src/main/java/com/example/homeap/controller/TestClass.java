package com.example.homeap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestClass {

    @RequestMapping("/home")
    public String home(){
        return "testPage";
    }
}
