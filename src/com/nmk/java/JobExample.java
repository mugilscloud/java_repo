package com.nmk.java;

public class JobExample {

	public static void main(String[] args){
		
		//System.out.println(JobApplication.companyName);  --can be used before creating the object J1,j2,etc.,
		
		JobApplication j1 = new JobApplication();
				
		j1.fname = "Kumar";
		System.out.println(JobApplication.companyName);
		j1.display();
	
		
		System.out.println();
	
		JobApplication j2 = new JobApplication("guru");
		j2.display();
		
		System.out.println();
		
		JobApplication j3 = new JobApplication("guru",1987);
		j3.show();
	}
}


class JobApplication{
	String fname;//instance variable
	int year;
	static String companyName = "Nmk global inc"; //class variable -- shared by all the objects -> does not change ------- static variables are created before creating an object
	
	
	JobApplication(){
		fname = "";
	}   
	
	
	JobApplication(String fn){
		fname = fn;
	}   
	
	JobApplication(String fn, int y){
		fname = fn;
		year = y;
	}   
	
	void display(){
		System.out.println(fname);
	}
	
	void show(){//method
		System.out.println(fname);
		System.out.println(year);
		System.out.println(findAge());
	}
	
	int findAge(){//function or method
		int currentYear = 2015;//local variable
		int age = currentYear - year;
		return age;
		
	}
}