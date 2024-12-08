package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {
	
	public FirstClass() {
		System.out.println("FirstClass instantiation");
	}
	public void firstMethod() {
		System.out.println("FirstClass firstMethod");
	}

}
