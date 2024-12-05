package com.example.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	Order order;
	Ordertake ordertake;
	@Autowired
	public User(Order order,@Qualifier("onlineOrder") Ordertake ordertake) {
		this.order=order;
		this.ordertake=ordertake;
		System.out.println("User Initialized");
		System.out.println(this.order);	}
	@PostConstruct
	public void init() {
		this.order.setOrder(this);
	}
}
