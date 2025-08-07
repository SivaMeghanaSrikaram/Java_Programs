package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		LinkedList<Integer> ll=new LinkedList();
		
		long StartTime = System.currentTimeMillis();
		
		//insertion in array
		for(int i=1;i<=10000;i++)
		{
			ll.add(i);
		}
		long EndTime=System.currentTimeMillis();
		long result=EndTime-StartTime;
		System.out.println("LinkedList Time: "+result);
		
		//insertion in linkedlist
		for(int i=1;i<=10000;i++)
		{
			al.add(i);
		}
		EndTime=System.currentTimeMillis();
		result=EndTime-StartTime;
		System.out.println("ArrayList Time: "+result);
		
	}

}
