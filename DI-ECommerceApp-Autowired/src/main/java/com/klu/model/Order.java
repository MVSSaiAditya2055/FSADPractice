package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	//use Autowired for constructor which u wish to use.
	//we need not use Autowired if there is only one constructor
	@Autowired
	public Order() {
		this.orderId=2005;
		this.customerName="Aditya";
		this.quantity=3;
	}
	
	public Order(int orderId, String sn, int qn) {
		this.orderId=2005;
		customerName=sn;
		quantity=qn;
	}
	
	public void display() {
		System.out.println("the following are the order details:");
		System.out.println("OrderId:"+orderId);
		System.out.println("CustomerName:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("ProductId:"+product.getProductId());
		System.out.println("ProductName:"+product.getProductName());
		System.out.println("ProductPrice:"+product.getPrice());
		System.out.println("ProductCategory:"+product.getCategory());
	}
}
