package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
@Id
private int pid;
private String pname;
private double price;
private String pcategory;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPcategory() {
	return pcategory;
}
public void setPcategory(String pcategory) {
	this.pcategory = pcategory;
}
public Product(int pid, String pname, double price, String pcategory) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.pcategory = pcategory;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pcategory=" + pcategory + "]";
}
}
