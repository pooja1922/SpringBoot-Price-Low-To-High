package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class DBservice 
{
@Autowired
private ProductRepository repo;

public void check() {
	List<Product> list=Arrays.asList(
			new Product(101,"mixture",3500,"Electronic"),
			new Product(102,"Oreao",50,"Food"),
			new Product(103,"Sprite",100,"Juice"),
			new Product(104,"Bread",50,"Food"),
			new Product(105,"Heater",2000,"Electronic"),
			new Product(106,"Ovan",5000,"Electronic"),
			new Product(107,"pen",30,"Study-Related"),
			new Product(108,"LED",35000,"Electronic"),
			new Product(109,"T-Shirt",500,"Cloth"),
			new Product(110,"shouse",1500,"shouse"),
			new Product(111,"camera",50000,"Daily-essentials"),
			new Product(112,"Charger",2500,"Electronic"),
			new Product(113,"milk",3500,"Food"),
			new Product(114,"Bucket",3500,"Pot")
			);
	repo.saveAll(list);
	
}

public List<Product> saveProduct(Product product) 
{
	
	return repo.findAll();
}

public List<Product> LowToHigh() {
    PageRequest request = PageRequest.of(0, 12, Sort.by("price").ascending());
    Page<Product> page = repo.findAll(request);
    return page.getContent();
}

public List<Product> HighToLow() 
{
	PageRequest request = PageRequest.of(0, 12, Sort.by("price").descending());
    Page<Product> page = repo.findAll(request);
    return page.getContent();
}

public List<Product> getFirstPage() 
{
	
		PageRequest request = PageRequest.of(0, 4);
		Page<Product> page = repo.findAll(request);
		return page.getContent();
	
}

public List<Product> getSecondPage() {
	
	PageRequest request = PageRequest.of(1,4);
	Page<Product> page = repo.findAll(request);
	return page.getContent();
}

public List<Product> getthirdPage() {
	PageRequest request = PageRequest.of(2,4);
	Page<Product> page = repo.findAll(request);
	return page.getContent();
}

public void insertData(Product product) 
{
	repo.save(product);
	
}
}
