package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.entity.MaxLengthInput;

public interface MaxLengthInputRepository extends JpaRepository <MaxLengthInput, Long>{
  
}
