package com.fundamentals;

public class Customer1 {
	//fields
		int cid;
		String cname;
		String add;
		long mobileno;
		
		//methods
		Customer1 (int cid,String cname,String add,long mobileno){
			this.cid=cid;                                                      
			this.cname=cname;                                                    
			this.add=add;                                                      
			this.mobileno=mobileno;                                                 
		}
		void getCustomerDetails()                                
		{
			System.out.println("cid is:"+cid);
			System.out.println("cname is:"+cname);
			System.out.println("Address is:"+add);
			System.out.println("Mobile number is:"+mobileno);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer1 ob=new Customer1(101,"megh","ong",987653578);
		ob.getCustomerDetails();
	}

}
