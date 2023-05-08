package com.example.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.product;
import com.example.bootdemo.repositary.productrepositary;

@RestController
public class productcontroller {
	@Autowired
	productrepositary pr;
	
	@PostMapping("/saveproduct")
	public String save(@RequestBody product p)
	{
		pr.save(p);
		return "data saved";
	}
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody product p)
	{
		pr.save(p);
		return "data updated";
	}
	@GetMapping("/findproduct")
	public List< product> findProductByCategory(@RequestParam String category)
	{
		return pr.findByCategory(category);
	}
	@GetMapping ("/findpricebetween")
	public List<product> findProductByPriceBetween(@RequestParam String price1, @RequestParam String price2)
	{
		return pr.findByPriceBetween(price1, price2);
	}
	@GetMapping("/findpricegreterthan")
	public List< product> findProductByPriceGreterThan(@RequestParam String price)
	{
		return pr.findByPriceGreaterThan(price);
	}
	@GetMapping("/findpricelessarthan")
	public List< product> findProductByPriceLessarThan(@RequestParam String price)
	{
		return pr.findByPriceLessThan(price);
	}
	
	@DeleteMapping("/deleteproduct")
	public String deleteStudent(@RequestParam int id)
	{
		pr.deleteById(id);
		return "data deleted succesfully";
	}
	
}
