package com.example.homeap.controller;

import com.example.homeap.service.KakaoService;
import com.example.homeap.service.UserService;
import com.example.homeap.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;


@Controller
public class KakaoController {
    @Autowired
    private KakaoService kakaoService;
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String home(@RequestParam(value = "code", required = false) String code, Model model) throws Exception{
        String userId = "ehowl9509";
        String access_Token = kakaoService.getAccessToken(code);
        HashMap<String, Object> userInfo = kakaoService.getUserInfo(access_Token);
        UserVo userVo = userService.findByUserid(userId);
        userService.LogSave(userVo);
        if(access_Token != null){
            model.addAttribute("nickname", userInfo.get("nickname"));
        }
        return "testPage";
    }
}
