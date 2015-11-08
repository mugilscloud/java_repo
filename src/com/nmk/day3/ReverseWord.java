package com.nmk.day3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//ReverseWord rv = new ReverseWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		
		String s1 = sc.nextLine();
		System.out.println("The input is: " +s1);
		
	//	String[] count = s1.split(" ");
	//	System.out.println("Word count is: " +count.length);
		
		StringBuilder sb = new StringBuilder(s1);
		String s2 = sb.reverse().toString();
		System.out.println(s2);
		
		
		String[] afterSplit = s2.split(" ");
		System.out.println("After string split: "  + afterSplit.length);
	
		for (int i = 0; i < afterSplit.length; i++){
			System.out.print(new StringBuilder(afterSplit[i]).reverse().toString() + " ");
		}
	
	}

}
