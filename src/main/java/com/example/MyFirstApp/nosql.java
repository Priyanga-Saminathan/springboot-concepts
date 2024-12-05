package com.example.MyFirstApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="nosql",value="enabled",
						havingValue="create",matchIfMissing=true)
public class nosql {
	public nosql() {
		System.out.println("nosql init");
	}
	
}
