package com.collections;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		// create collection object
		Vector ll = new Vector();
		
		//1.insert
		ll.add(10);
		ll.add("Meghana");
		ll.add(true);
		ll.add(987654335);
		//duplicate
		ll.add(10);
		//null values
		ll.add(null);
		System.out.println(ll);
		System.out.println(ll.size());
		
		//2.delete or remove
		ll.remove(2);
		System.out.println(ll);
		System.out.println(ll.size());
		
		//3.search
		System.out.println(ll.contains("Meghana"));
		
		//4.get or retrieve
		System.out.println(ll.get(2));
		
		//5.sorting

	}

}

