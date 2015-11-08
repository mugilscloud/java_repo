package com.nmk.java;

public class ThisExample {

	int age;
	Emp(){
		name = "default";
		age = 0;
		System.out.println("default");
	}
	
	Emp(int age){
		this.age = age;
		System.out.println("age-c");
	}
	
	Emp(String name, int age){
		this(age);
		System.out.println("age-c");
	}
	
}
