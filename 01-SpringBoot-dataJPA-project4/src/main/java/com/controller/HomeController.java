package com.controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Product;
import com.service.DBservice;

@Controller
public class HomeController {
	@Autowired
	private DBservice service;
	
	@RequestMapping("/")
	public String mainPage()
	{
		return"index";
	}
	@RequestMapping("/success")
	public String landingPage(@ModelAttribute Product product,Model model)
	{
		System.out.println("success page called");
		List<Product> list=service.saveProduct(product);
		model.addAttribute("data",list);
		return"success";
	}
	@RequestMapping("LowToHigh")
	public String LowToHigh(@ModelAttribute Product product,Model model)
	{
		System.out.println("low to high range method called");
		List<Product>list=service.LowToHigh();
		model.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("HighToLow")
	public String HighToLow(@ModelAttribute Product product,Model model)
	{
		System.out.println("High To Low range method called");
		List<Product>list=service.HighToLow();
		model.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("/product")
	public String insertData()
	{
		System.out.println("insert data page called");
		return"product";
	}
	@RequestMapping("insertData")
	public String insertData(@ModelAttribute Product product)
	{
		System.out.println("inserting data page called..");
		service.insertData(product);
		return"success";
	}
	@RequestMapping("/firstFour")
	public String FirstPage(Model model)
	{
		System.out.println("FirstPage method called..!");
		List<Product> pList = service.getFirstPage();
		System.out.println(pList);
		model.addAttribute("data",pList);
		return "success";		
	}
	
	@RequestMapping("/secondfour")
	public String secondPage(Model model)
	{
		System.out.println("second page method called..!");
		List<Product> pList = service.getSecondPage();
		System.out.println(pList);
		model.addAttribute("data",pList);
		return "success";		
	}
	@RequestMapping("/thirdfour")
	public String thirdPage(Model model)
	{
		System.out.println("third page method called..!");
		List<Product> pList = service.getthirdPage();
		System.out.println(pList);
		model.addAttribute("data",pList);
		return "success";		
	}
}
