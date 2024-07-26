package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.entity.EducationForm;

public interface EducationFormRepository extends JpaRepository <EducationForm, Long>  {
  
}
