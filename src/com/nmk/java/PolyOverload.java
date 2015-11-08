package com.nmk.java;

public class PolyOverload {
	public static void main(String[] args){
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2,3,4,5));
	}

	public static int sum(int a, int b){
		return a+b;
	}
	public static int sum(int a, int b, int c){
		return a+b+c;
	}
	public static int sum(int a, int b, int c, int d){
		return a+b+c+d;
	}
}
