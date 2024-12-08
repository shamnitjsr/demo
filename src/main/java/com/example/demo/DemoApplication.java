package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(DemoApplication.class, args);

//		var firstClass = context.getBean(FirstClass.class);
//		firstClass.firstMethod();
//		
//		var firstClassNew = context.getBean(FirstClass.class);
//		firstClassNew.firstMethod();
//		
//		System.out.println("Same instance?" + (firstClass == firstClassNew));
//		System.out.println("FirstClass Hash " +firstClass.hashCode());
//		System.out.println("FirstClassNew Hash " +firstClassNew.hashCode());
//		

//		FirstClass firstClass = new FirstClass();
//		firstClass.firstMethod();
//		
//		FirstClass firstClassNew = new FirstClass();
//		firstClassNew.firstMethod();
//		
//		System.out.println("FirstClass Hash " +firstClass.hashCode());
//		System.out.println("FirstClassNew Hash " +firstClassNew.hashCode());
//		
//		System.out.println("Same instance?" + (firstClass == firstClassNew));

//		SingleConstructorClass singleConstructorClass = new SingleConstructorClass(new FirstClass());
//		singleConstructorClass.getFirstClass();

		// Constructor DI
		var singleConstructorClass = context.getBean(SingleConstructorClass.class);
		singleConstructorClass.getFirstClass();
	}

}
