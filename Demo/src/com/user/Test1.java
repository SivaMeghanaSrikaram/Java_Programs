package com.user;

abstract class Demo {
	int a=10;
}
public class Test1 extends Demo{
	Test1()
	{
		System.out.println(a);
}

	public static void main(String[] args) {
		
		//Demo t=new Demo();  cannot create object to the abstract class
	}
}

