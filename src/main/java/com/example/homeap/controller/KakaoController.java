package com.example.homeap.controller;

import com.example.homeap.service.KakaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KakaoController {
    @Autowired
    private KakaoService kakaoService;

    @RequestMapping("/login")
    public String home(@RequestParam(value = "code", required = false) String code) throws Exception{
        System.out.println("#########" + code);
        String access_Token = kakaoService.getAccessToken(code);
        System.out.println("###access_Token#### : " + access_Token);
        return "testPage";
    }
}
