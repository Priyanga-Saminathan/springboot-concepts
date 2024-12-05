package com.example.MyFirstApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Ordertake {
	public OnlineOrder() {
		System.out.println("Online order works");
	}
	
}
