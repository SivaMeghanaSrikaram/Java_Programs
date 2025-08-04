package com.exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
		System.out.println(a/b);
		} //try
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
			} //catch
		System.out.println("Hi");

	}

}
