package com.collections;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListWithRealObject {

	public static void main(String[] args) {
		
		LinkedList<Product> al = new LinkedList();
		
		//create product objects
		Product p = new Product(1001,"LG",12000);
		Product p1 = new Product(1003,"Realme",10000);
		Product p2 = new Product(1002,"Samsung",15000);
		
		//add
		al.add(p);
		al.add(p1);
		al.add(p2);
		System.out.println(al);
		System.out.println(al.size());
		
		//to retrieve all objects from collections
		for(Product pro:al) {
			System.out.println(pro.getPid()+" "+pro.getPname()+" "+pro.getPrice());
		}
		
		System.out.println("Results after ");
		Collections.sort(al);
		for(Product pro:al) {
			System.out.println(pro.getPid()+" "+pro.getPname()+" "+pro.getPrice());
		}
		
	}

}
