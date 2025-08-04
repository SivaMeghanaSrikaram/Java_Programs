package com.vehicle;

public class Car1 implements Vehicle1{
	//a=20;...cannot initilize it again bcoz it is final in its interface so that we cannot change

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("a value:"+a);
		System.out.println("open the door");
		System.out.println("turnkey");
		System.out.println("press the accelerator");
		
	}


	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("remove leg on acceleartor");
		System.out.println("press the break");
		System.out.println("turn key left");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ca=new Car();
		ca.start();
		ca.stop();
		ca.offerDetails();

	}

}
