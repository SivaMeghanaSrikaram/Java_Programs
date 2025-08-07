package com.collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {


	public static void main(String[] args) {
		// create collection object
		LinkedList ll = new LinkedList();
		
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
		
		//List iterator
		ListIterator lit=ll.listIterator();
		
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

