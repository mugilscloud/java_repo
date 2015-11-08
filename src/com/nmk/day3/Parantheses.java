package com.nmk.day3;

import java.util.*;

public class Parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Stack<String> st = new Stack<String>();

		while (sc.hasNext()) {
			String input = sc.next();

			String[] inputArray = input.split("");
			for (int i = 0; i < inputArray.length; i++) {
				st.push(input);
				System.out.println("STack push: " + input);
			}
		}

		while (!st.isEmpty()) {
			st.pop();
			System.out.println("Stack pop: " + st);
		}
	}

}
