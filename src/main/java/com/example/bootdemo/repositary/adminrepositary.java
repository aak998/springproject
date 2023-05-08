package com.example.bootdemo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.admin;
import com.example.bootdemo.dto.student;

public interface adminrepositary extends JpaRepository<admin, Integer>{
	List<admin> findByName(String name);
	List<admin> findByMbl(int mbl);

}
