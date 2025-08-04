package com.exception;

public class MultipleTimesTryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hi");
		
		int array[]= {1,2,3};
		try {
			System.out.println(array[5]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
