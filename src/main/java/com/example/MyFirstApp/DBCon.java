package com.example.MyFirstApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
@Component
public class DBCon {
	@Value("${username}")
	String username;
	@Value("${password}")
	String password;
	@PostConstruct
	public void init() {
		System.out.println("Username:"+username+" Password:"+password);
	}
	
}
