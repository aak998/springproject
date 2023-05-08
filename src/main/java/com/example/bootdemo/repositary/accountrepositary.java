package com.example.bootdemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.account;

public interface accountrepositary extends JpaRepository<account, Integer> {
	account findByEmailAndPass(String email,String pass);

}
