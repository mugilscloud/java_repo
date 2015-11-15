package com.nmk.day5;

public class NumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		System.out.println("Numbers 1 to 1000:\n ");
		for (i = 1; i <= 1000; i++) {

			// System.out.print(i + ((i % 10 == 9) ? "\n" : " "));
			System.out.print(i);
			if (i % 10 == 9) {
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println("\n\nMultiples of 5!!\n");
		for (i = 1; i < 1000; i = i+4) {
			if (i % 5 == 0) {
				System.out.print(i + ((i / 5 == 10) ? "\n" : " "));
			}
		}

		System.out.println("\n\nOdd numbers till 1000!!\n");
		for (i = 1; i < 1000; i = i+2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
