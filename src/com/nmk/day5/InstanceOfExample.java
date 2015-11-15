package com.nmk.day5;

import java.util.*;

public class InstanceOfExample {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String)// Hints: use instanceof operator
				break;
		}
		return it;

	}

	public static void main(String[] argh) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}
		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		// Iterator it = func(mylist);
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String) {
				System.out.println((String) element);
			}
			if (element instanceof Integer) {
				System.out.println((int) element);
			}
		}
	}
}
