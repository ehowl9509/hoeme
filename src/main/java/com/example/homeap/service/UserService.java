package com.example.homeap.service;


import com.example.homeap.repository.UserRepository;
import com.example.homeap.vo.UserVo;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserVo> findAll() {
        List<UserVo> users = new ArrayList<>();
        userRepository.findAll().forEach(e -> users.add(e));
        return users;
    }

    public UserVo findByUserid(String UserId){
        UserVo userVo = userRepository.findByUserid(UserId);
        return userVo;
    }
    public void LogSave(UserVo userReq){
        UserVo userVo = UserVo.builder()
                .userid(userReq.getUserid())
                .username(userReq.getUsername())
                .userpw(userReq.getUserpw())
                .build();
        userRepository.save(userVo);
        System.out.println("######"+userReq.getUsername());
    }

}
