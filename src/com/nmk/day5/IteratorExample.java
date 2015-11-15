package com.nmk.day5;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList mylist = new ArrayList();
		mylist.add("Hello");
		mylist.add("Java");
		mylist.add(4);
		
		Iterator it = mylist.iterator(); 
		
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
	}

}
