package com.vehicle;

public interface Vehicle1 {
	int a=10;
	void start();   //abstract method
	void stop();
	default void offerDetails()      //concrete method
	{
		System.out.println("20% off");
	}

}
