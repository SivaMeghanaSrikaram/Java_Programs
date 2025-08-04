/*
 RULES
1.If super class method does not declare any exception then 
 its sub class method don't declare compile time exception
2.If super class method does not declare any exception then 
 its sub class method can declare run time exception
3.If super class method declare any exception, then in sub class 
 we need to declare the same exception or sub exception but not 
 super exception
 */
package com.exception;

import java.io.IOException;

class Test{
	//method
	void show() throws IOException{
		System.out.println("Hi");
	}
}

public class ExceptionMethodOverridding extends Test{
	//method

	void show() throws Exception{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		//Reference variable
		Test t;
		t = new Test();
		t.show();
		t = new ExceptionMethodOverridding();
		t.show();
	}

}
