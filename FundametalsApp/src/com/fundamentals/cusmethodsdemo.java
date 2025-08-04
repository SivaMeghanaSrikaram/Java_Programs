package com.fundamentals;

import java.util.Scanner;


public class cusmethodsdemo {
	int cid;
	String name;
	String add;
	long mobile;
	static String bankname="ICICI";
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
		System.out.println("Bank Name:"+bankname);
	}
	static void suggestionsToCustomer()
	{
		System.out.println("never share otp!!");
		System.out.println("age must be above 18");
		System.out.println("please maintain min balance");
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("welcome to icici bank");
    	for(int i=1;i<=2;i++)
    	{
    	System.out.println("please enter your details");
    	System.out.println("please enter ID");
    	int a=sc.nextInt();
    	System.out.println("please enter name");
    	String b=sc.next();
    	System.out.println("please enter address");
    	String c=sc.next();
    	System.out.println("enter mobile number");
    	long d=sc.nextLong();
    	cusmethodsdemo c1=new cusmethodsdemo();
    	c1.setCustomerDetails(a, b, c, d);  //arguments
    	c1.getCustomerDetails();
    	cusmethodsdemo.suggestionsToCustomer();
    	}
    }
}

