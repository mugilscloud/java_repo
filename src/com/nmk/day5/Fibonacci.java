package com.nmk.day5;

import java.util.Scanner;

public class Fibonacci { //without recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int count = sc.nextInt();

		int f1 = 0, f2 = 1, f3, i;
		System.out.print(f1 + " " + f2);

		for (i = 2; i < count; i++) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}

	}

}
