package com.example.bootdemo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.product;

public interface productrepositary extends JpaRepository<product , Integer> {
List< product> findByCategory(String category);
	
	List<product> findByPriceBetween(String price1, String price2);
	
	List<product> findByPriceGreaterThan(String price);

	List<product> findByPriceLessThan(String price);

}
