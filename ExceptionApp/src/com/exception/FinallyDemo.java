package com.exception;

public class FinallyDemo {
	public static void main(String[] args) {

		int a=10,b=0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("Hi");
		System.out.println("Hello");
		}
		System.out.println("Welcome");

	}
}