package com.nmk.day4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashsetExample {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		HashSet hs = new HashSet();

		Scanner sc = new Scanner(System.in);
		int inputT = sc.nextInt();
		sc.nextLine(); // removes \n after reading integer value

		for (int i = 0; i < inputT; i++) {
			String str = sc.nextLine();

			hs.add(str);
			System.out.println(hs.size());
		}
	}
}
