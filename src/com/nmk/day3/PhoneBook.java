package com.nmk.day3;

import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("input n--> " + n);

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int phone = sc.nextInt();
			System.out.println("input name--> " + name);
			System.out.println("input phone--> " + phone);
			hm.put(name, phone);
		}

		while (sc.hasNext()) {
			String mapName = sc.next();
			System.out.println("Name = " + mapName + " Phone = " + hm.get(mapName));
		}
//		System.out.println("Hashmap: " + hm);
		
	}

}
