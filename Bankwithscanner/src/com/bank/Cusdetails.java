package com.bank;

import java.util.Scanner;

public class Cusdetails {
	int cid;
	String name;
	String add;
	long mobile;
	void setCustomerDetails(int a,String b,String c,long d) //parameters
	{
		cid=a;
		name=b;
		add=c;
		mobile=d;
	}
	void getCustomerDetails()
	{
		System.out.println("cid is:"+cid);
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+add);
		System.out.println("Mobile number is:"+mobile);
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("welcome to icici bank");
    	System.out.println("please enter your details");
    	System.out.println("please enter ID");
    	int a=sc.nextInt();
    	System.out.println("please enter name");
    	String b=sc.next();
    	System.out.println("please enter address");
    	String c=sc.next();
    	System.out.println("enter mobile number");
    	long d=sc.nextLong();
    	Cusdetails c1=new Cusdetails();
    	c1.setCustomerDetails(a, b, c, d);  //arguments
    	c1.getCustomerDetails();		
    }
}
