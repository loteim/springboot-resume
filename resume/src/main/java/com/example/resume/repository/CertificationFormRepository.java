package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.entity.CertificationForm;

public interface CertificationFormRepository extends JpaRepository<CertificationForm, Long>{
  
}
