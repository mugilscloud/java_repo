package com.nmk.day3;

import java.io.*;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		/*
		 * StringBuilder sb = new StringBuilder(A); String[] tempInput = sb;
		 * System.out.println("The length of the string is: " tempInput.length);
		 */
		System.out.println(A);
		int last = A.length();

		for (int i = 0; i < last / 2; i++) {
			System.out.println("i: " + i);
			System.out.println("last: " + last);

			String[] stringArray = A.split("");
			System.out.println("After the string assignment!");
			System.out.println("Str1: " + stringArray[i]);
			System.out.println("Str2: " + stringArray[last - 1]);

			if (stringArray[i].equals((stringArray[last - 1]))) {
				System.out.println("Memory -> arr1 " + stringArray[i] + " arr2 " + stringArray[last - 1]);
				System.out.println("Inside if loop!! ");
			} else {
				// Error
				System.out.println("Inside else loop! - Not a palindrome!");
				return;
			}

            last--;
			System.out.println("i: " + i);
			System.out.println("last: " + last);
		}
		System.out.println("The input is a Palindrome!");
	}

}
