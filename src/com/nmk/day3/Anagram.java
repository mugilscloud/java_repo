package com.nmk.day3;

import java.io.*;
import java.util.*;

public class Anagram {

	static boolean isAnagram(String A, String B) {
		// Complete the function
		if (A.length() == B.length()) {
			char[] charArrayA = A.toLowerCase().toCharArray();
			char[] charArrayB = B.toLowerCase().toCharArray();
			Arrays.sort(charArrayA);
			Arrays.sort(charArrayB);
			if (Arrays.equals(charArrayA, charArrayB)) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
