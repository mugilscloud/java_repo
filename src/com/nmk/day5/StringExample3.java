package com.nmk.day5;

public class StringExample3 {
	public static void main(String[] args) {
		String st = new String("Java is a           programming language");
		String st1 = new String("Java is a OOP");
		char c = st.charAt(8);
		System.out.println(c);
		System.out.println(st.length());
		st += "." + st;
		System.out.println(st1);
		System.out.println(st.concat(st1));
		System.out.println(st);
		System.out.println(st1);
		// st.replace(" ", "%20"); // for a string without multiple spaces
		System.out.println(st.replaceAll("\\s+", "%20")); // for a string
															// multiple
															// spaces

		System.out.println(st.substring(4));
		System.out.println(st.substring(0, 5));
		/*
		 * + => one or more * => 0 or more \s => space \n => new line \t => tab
		 * \r => carrier return
		 */

		System.out.println(st.codePointAt(8));
		String[] st2 = st.split("\\s+");
		for (String st3 : st2) {
			System.out.println("String -->" + st3);
		}
	}
}
