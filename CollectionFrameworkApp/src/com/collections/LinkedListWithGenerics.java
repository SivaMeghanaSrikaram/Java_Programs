package com.collections;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListWithGenerics {
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList();
		
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
