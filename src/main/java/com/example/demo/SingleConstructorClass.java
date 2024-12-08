package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SingleConstructorClass {

	private FirstClass firstClass;

	public SingleConstructorClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}

	public void getFirstClass() {
		firstClass.firstMethod();
	}

	

}
