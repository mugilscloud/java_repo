package com.nmk.day3;

public class InterfaceEx {
	public static void main(String[] args){
		UsBank ub = new UsBank(1000);
		System.out.println(ub.perOfInterest());
	}
}

class Bank{
	int amount;
	
	Bank(){
		
	}
	
	public Bank(int amount){
		this.amount = amount;
	}
}

interface Function{
	double perOfInterest(); //compiler take this stmt as public abstract double perOfInterest()
}

class UsBank extends Bank implements Function{
	UsBank(int amount){
		super(amount);
	}
	
	public double perOfInterest(){
		return ((amount*3)/100);
	}
}