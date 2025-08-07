package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//collection object
		//HashMap hs = new HashMap();   //store in diff order
		LinkedHashMap hs = new LinkedHashMap(); //store in same order
		
		//insert
		hs.put(1, 10);
		hs.put("second",20 );
		hs.put(true, "Meghana");
		hs.put(3, 987689769l);
		hs.put("second",30 );
		hs.put(4,"Meghana");
		System.out.println(hs);
		System.out.println(hs.size());
		
	}

}
