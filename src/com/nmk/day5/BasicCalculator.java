package com.nmk.day5;

import java.util.*;

public class BasicCalculator {
	int result, input1, input2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator bc = new BasicCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		bc.input1 = sc.nextInt();
		System.out.println("Enter the first number: ");
		bc.input2 = sc.nextInt();
		System.out.println("Choose an option:\n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n");
		System.out.println("Enter the number: ");
		int choice = sc.nextInt();

		if (choice == 1) {
			bc.methodAdd();
		} else if (choice == 2) {
			bc.methodSub();
		} else if (choice == 3) {
			bc.methodMul();
		} else if (choice == 4) {
			bc.methodDiv();
		} else {
			System.out.println("Enter a number from 1 to 4!!");
		}

	}

	public void methodAdd() {
		result = input1 + input2;
		System.out.println("The addition of numbers is: " + result);
	}

	public void methodSub() {
		if (input1 > input2) {
			result = input1 + input2;
		} else {
			result = input2 + input1;
		}
		System.out.println("The subtraction of numbers is: " + result);
	}

	public void methodMul() {
		
		result = input1 * input2;
		System.out.println("The addition of numbers is: " + result);
	}

	public void methodDiv() {
		result = input1 / input2;
		System.out.println("The addition of numbers is: " + result);
	}

}
