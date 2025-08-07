package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		
		//adding integers
		al.add(20);
		al.add(40);
		al.add(10);
		al.add(30);
		al.add(5);
		
		System.out.println(al);
		System.out.println(al.size());
		
		//sorting
		Collections.sort(al);
		System.out.println(al);
		
	}

}
