package com.example.resume.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.resume.repository.CertificationFormRepository;
import com.example.resume.repository.EducationFormRepository;
import com.example.resume.repository.ExperienceFormRepository;
import com.example.resume.repository.HighSchoolFormRepository;
import com.example.resume.repository.MaxLengthInputRepository;
import com.example.resume.repository.UserInfoRepository;
import com.example.resume.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class ResumeController {
  
  @Autowired CertificationFormRepository certificationFormRepository;
  @Autowired EducationFormRepository educationFormRepository;
  @Autowired ExperienceFormRepository experienceFormRepository;
  @Autowired HighSchoolFormRepository highSchoolFormRepository;
  @Autowired MaxLengthInputRepository MaxLengthInputRepository;
  @Autowired UserRepository userRepository;
  @Autowired UserInfoRepository userInfoRepository;

  @PostMapping("/resume")
  public String resume() {

      return resume();
  }
  
}
