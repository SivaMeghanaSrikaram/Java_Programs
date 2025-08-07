package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// create collection object
		ArrayList al = new ArrayList();
		
		//1.insert
		al.add(10);
		al.add("Meghana");
		al.add(true);
		al.add(987654335);
		//duplicate
		al.add(10);
		//null values
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		//2.delete or remove
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		
		//3.search
		System.out.println(al.contains("Meghana"));
		
		//4.get or retrieve
		System.out.println(al.get(2));
		
		for(Object o:al) {
			System.out.println("All values:"+o);
		}
		
		//List iterator
		ListIterator lit=al.listIterator();
		
		System.out.println("Result in forward direction");
		while(lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}
		
		System.out.println("Result in backward direction");
		while(lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);
		}
		
		/*//with iterator
		Iterator it = al.iterator();  //used to retrieve the elements one by one
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}*/
	
		
		//5.sorting (will see in other programs)

	}

}
