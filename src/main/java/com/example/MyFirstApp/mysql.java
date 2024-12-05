package com.example.MyFirstApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="mysql",value="enabled",
						havingValue="create",matchIfMissing=false)
public class mysql {
	public mysql() {
		System.out.println("mysql init");
	}
}
