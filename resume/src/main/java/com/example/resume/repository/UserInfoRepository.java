package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository <UserInfo, Long>{
  
}
