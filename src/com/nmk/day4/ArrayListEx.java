package com.nmk.day4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListEx {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();

		ArrayList<Integer>[] arrList = new ArrayList[inputN];
		int inputArrSize = 0;

		for (int i = 0; i < inputN; i++) {
			inputArrSize = sc.nextInt();
			arrList[i] = new ArrayList<Integer>();
			for (int j = 0; j < inputArrSize; j++) {
				arrList[i].add(sc.nextInt());
			}
		}

		int inputCheck = sc.nextInt();
		for (int i = 0; i < inputCheck; i++) {
			int x = sc.nextInt(); // array List
			int y = sc.nextInt(); // index
			if (arrList[x - 1].size() < (y - 1)) {
				System.out.println("ERROR");
			} else {
				System.out.println(arrList[x - 1].get(y - 1));
			}

		}
		for (int i = 0; i < inputN; i++) {

			for (Integer item : arrList[i]) {
				System.out.print(item + " ");
			}
			System.out.println();
		}

	}
}