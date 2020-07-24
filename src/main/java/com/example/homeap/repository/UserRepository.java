package com.example.homeap.repository;

import com.example.homeap.vo.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserVo, Long> {


    UserVo findByUserid(String UserId);


}
