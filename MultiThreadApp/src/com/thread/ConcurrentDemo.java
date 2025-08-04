package com.thread;
public class ConcurrentDemo extends Thread{
	//Override run method
	    public void run()
	    {
	        for (int i=1; i<=10;i++)
	        {
	            System.out.println("Realme model :"+i);
	        }
	    }
	    public static void main(String[] args) {
	        //create object
	        ConcurrentDemo sd = new ConcurrentDemo();
	        //Call run method by using start method
	        sd.start();
	        for (int i=1; i<=10;i++)
	        {
	            System.out.println("OnePlus model :"+i);
	        }

	    }
	}