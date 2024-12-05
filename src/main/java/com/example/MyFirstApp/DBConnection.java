package com.example.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("dev")
public class DBConnection {
	@Autowired(required=false)
	mysql my;
	@Autowired(required=false)
	nosql no;
	@PostConstruct
	public void init(){
		System.out.println("DBConnection initiated:"+my+" "+no);
	}
}
