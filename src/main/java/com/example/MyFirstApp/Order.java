package com.example.MyFirstApp;

import org.springframework.stereotype.Component;

@Component
public class Order {
	User user;
	public Order() {
		System.out.println("Init Order");
	}
	public void print() {
		System.out.println("Constructor injection works");
	}
	public void printsetter() {
		System.out.println("Setter injection works");
	}
	public void setOrder(User user) {
		// TODO Auto-generated method stub
		this.user=user;
	}
}
