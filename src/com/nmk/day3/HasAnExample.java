package com.nmk.day3;

public class HasAnExample {
	public static void main(String[] args){
		Person p1 = new Person("Nmk");
		Car c1 = new Car(p1, "BMW");
		p1.display();
		c1.display();
		
		//call by reference
		p1.name = "Apex2";
		p1.display();
		c1.display();
		
		//call by value
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
}

class Person{
	String name;
	public Person(){
	}
	public Person(String name){
		this.name = name;
	}
}

class Car{ //extends Object
	Person owner; //HAS A relationship
	String CarName;
	public Car(){
		super();// points Object()
	}
	public Car(Person owner, String carName){
		this.owner = owner;
		CarName = carName;
	}
	public void display(){
		owner.display();
		System.out.println("carname: " +CarName);
	}
}


public static void swap(int a, int b){ //call by value ---- if primitive values are passed. here a,b and temp are all local variables of swap method
	int temp = 0;
	temp = a;
	a = b;
	b = temp;
	System.out.println(a);
	System.out.println(b);
}