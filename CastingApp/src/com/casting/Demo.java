package com.casting;

public class Demo {

	public static void main(String[] args) {
		int a=10;
		double b;
		//implicit casting
		b = a;
		System.out.println("b value is: "+b);
		
		double c = 25.5;
		int d;
		d=(int)c;  //explicit casting
		System.out.println("d value is: "+d);
	}
}
