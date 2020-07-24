package com.example.homeap.service;


import com.example.homeap.repository.UserRepository;
import com.example.homeap.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
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

    public String findByUserid(String UserId){
        UserVo userVo = userRepository.findByUserid(UserId);
        System.out.println("######"+ userVo);
        return UserId;
    }

}
