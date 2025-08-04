package com.fundamentals;

public class MethodsDemo {
	void first()   //non-static method
	{
		System.out.println("hi");
	}
	static void second()  //static method
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo md=new MethodsDemo();
		md.first();
		MethodsDemo.second();
	}

}
