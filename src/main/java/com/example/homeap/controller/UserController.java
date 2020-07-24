package com.example.homeap.controller;

import com.example.homeap.service.UserService;
import com.example.homeap.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/jpa")
    public void test(){
        List<UserVo> user = userService.findAll();
        System.out.println("user##########" + user);
    }

}
