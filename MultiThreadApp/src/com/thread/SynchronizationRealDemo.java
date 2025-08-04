package com.thread;

import java.util.Scanner;

class Account{
	//fields
	long accno;
	int bal;
	
	//constructor
	Account(long accno, int bal){
		this.accno=accno;
		this.bal=bal;
	}
	
	//method
	public boolean isSuffBal(int amt) {
		if(bal>=amt) {
			return true;
		}
		else {
			return false;
		}
	}//method isSuffBal() close
	
	public void withdraw(int amt) {
		bal=bal-amt;
		System.out.println("Withdrawl amount :"+amt);
		System.out.println("Current Balance :"+bal);
	}//closing withdraw()
	
}//closing account class

class Customer implements Runnable{
	//fields
	String cname;
	Account acc;
	
	//constructor
	Customer(String cname,Account acc){
		this.cname = cname;
		this.acc = acc;
	}
	
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to SBI");
		synchronized(acc) {
			
		System.out.println(cname+" "+"Please enter amount you withdraw");
		int amount = sc.nextInt();
		if(acc.isSuffBal(amount)) {
			acc.withdraw(amount);
		}
		else {
			System.out.println("Sorry Insufficien Balance");
		}
		} //end of the synchronization block
	}
}
public class SynchronizationRealDemo {

	public static void main(String[] args) {
		
		Account ac = new Account(123456,1000);
		Customer c1=new Customer("Meghana",ac);
		Customer c2=new Customer("Manasa",ac);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();

	}
}