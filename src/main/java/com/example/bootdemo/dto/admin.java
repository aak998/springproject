package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class admin {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMbl() {
		return mbl;
	}
	public void setMbl(int mbl) {
		this.mbl = mbl;
	}
	private String name;
	private int mbl;

}
