package com.example.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.account;
import com.example.bootdemo.repositary.accountrepositary;
@RestController
public class accountcontroller {
	@Autowired
	accountrepositary ar;
	
	@PostMapping("/save")
	public String saveAccount(@RequestBody account a) {
		ar.save(a);
			return "account saved";
	}
	@GetMapping ("/login")
	public String loginValidation(@RequestBody account a) {
	account at=ar.findByEmailAndPass(a.getEmail(), a.getPass());
	
	if(at!=null) {
		return "login succesful"; 
	}
	else {
		return "please try again invalid attepmt";
	}
	}
}
