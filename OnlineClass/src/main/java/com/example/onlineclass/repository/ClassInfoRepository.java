package com.example.onlineclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineclass.model.ClassInfo;


public interface ClassInfoRepository extends JpaRepository<ClassInfo, String> {

	
}
