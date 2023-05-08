package com.example.bootdemo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.student;

public interface studentrepositary extends JpaRepository<student, Integer> {
List<student> findByName(String name);
List<student> findByAge(int age);
List<student> findByAgeGreaterThan(int age);
List<student> findByAgeLessThan(int age);

}
