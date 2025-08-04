package com.exception;

public class Tricky {

	public static void main(String[] args) {
		
		int a=10,b=0;
		try {
			System.out.println("Full stack");
			System.exit(0);
			System.out.println(a/b);
			System.out.println("Welcome"); //will not be executed bcoz of the above exception line
		}
		/*catch(Throwable e) {
			e.printStackTrace();
		} //catch
		*/
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Hi");
		}
	}