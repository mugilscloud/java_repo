package com.nmk.day5;

public class SBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("java");
		StringBuffer sb3 = new StringBuffer(200);

		System.out.println(sb1.capacity()); //16
		System.out.println(sb2.capacity()); //20
		System.out.println(sb3.capacity()); //200
		
		sb1.append("abcdefghijklmnopqrstuvwxyz");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
	}
}
