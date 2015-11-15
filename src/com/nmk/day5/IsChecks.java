package com.nmk.day5;

import java.util.*;

public class IsChecks {
	int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsChecks ic = new IsChecks();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String input = sc.next();

		ic.isInteger(input);
		if (true) {
			System.out.println("The input is an Integer!");
			ic.isEvenNumber();
			if (true) {
				System.out.println("The number is even!");
			} else {
				ic.isOddNumber();
			}

			ic.isPrimeNumber();

		} else {
			System.out.println("Enter a valid input in numbers!");
		}

	}

	public Boolean isInteger(String input) {
		try {
			num = Integer.parseInt(input); // is an integer
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public Boolean isOddNumber() {
		if ((num != 0) && ((num / 2) != 0)) {
			return true;
		}
		return false;
	}

	public Boolean isEvenNumber() {
		if ((num != 0) && ((num / 2) == 0)) {
			return true;
		}
		return false;
	}

	public Boolean isPrimeNumber() {
		for (int i = 2; i < num; i++) {
			if (num % i != 0) {
				System.out.println("The number is prime!");
			}
		}
		return false;
	}
}
