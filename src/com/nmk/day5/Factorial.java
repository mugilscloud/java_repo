package com.nmk.day5;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int input = sc.nextInt();

		int fac = 1;

		for (int i = 1; i <= input; i++) {
			fac = fac * i;
			
		}
		System.out.println("Factorial-->" + fac);
	}

}

