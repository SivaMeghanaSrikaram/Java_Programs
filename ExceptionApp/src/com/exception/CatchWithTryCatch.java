package com.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CatchWithTryCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException aoe)
		{
			aoe.printStackTrace();
		}
		catch(Exception e) {
			
			//writing data into a file
			try {
				FileWriter fw = new FileWriter("ExceptionInfo.txt");
				Date d = new Date();
				//convert exception object into string
				String msg = e.toString();
				String msg1 = d.toString();
				
				//To write
				fw.write(msg);
				fw.write(msg1);
				//confirmation
				System.out.println("Operation success");
				
				//To close
				fw.close();
				
				} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			
			}
		System.out.println("Hi");
		System.out.println("Hello");
	}
}
