package com.nmk.day5;

import java.util.*;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		HashSet<Character> hs = new HashSet<Character>();

		char[] inputChar = inputStr.toLowerCase().toCharArray();
        String output = new String();
		for (char item : inputChar) {
			System.out.println("character array--> " + item);
			if (!hs.contains(item)) {
				output += item;
			}
			hs.add(item);
		}

		System.out.println(output);
		//System.out.println(hs);

	}

}
