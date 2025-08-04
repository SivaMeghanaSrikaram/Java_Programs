//bank app
package com.bank;

public class Customer {
	//fields
	int cid;
	String name;
	String address;
	long mobilenumber;
	
	//methods
	void setCustomerDetail(int a,String b,String c,long d)
	{
		cid=a;
		name=b;
		address=c;
		mobilenumber=d;
	}
	
	void getCustomerDetail()
	{
		System.out.println("Cid : "+cid);
		System.out.println("Cname : "+name);
		System.out.println("address : "+address);
		System.out.println("Mobile Number : "+mobilenumber);
	}
	
	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.setCustomerDetail(1001,"Nasan","Ongole",886789870);
		c.getCustomerDetail();
		
	}

}
