package com.fundamentals;

public class EnhancedForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollnos[]= {1001,1002,2233,2001};
		//traverse
		for(int i=0;i<rollnos.length;i++)
		{
			System.out.println(rollnos[i]);
		}
		//enhanced for loop
		for(int rollno:rollnos)
		{
			System.out.println(rollno);
		}
	}

}
