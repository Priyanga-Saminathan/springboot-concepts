package com.example.MyFirstApp;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Ordertake{
	public OfflineOrder() {
		System.out.println("Offline order works");
	}
	
}
