package com.exception;

import java.util.Scanner;

public class TrtWithTryCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		int arr[]= {1,2,3};
		try {
			try {
				System.out.println(arr[5]);
			}
			catch(ArrayIndexOutOfBoundsException aoe)
			{
				aoe.printStackTrace();
		    }
		System.out.println("Hi");	
		System.out.println(a/b);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		System.out.println("Hello");
		}
	}