package com.thread;

public class ThreadPriority extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread: "+i);
		}
	}
	public static void main(String[] args) {
		
		ThreadPriority tp=new ThreadPriority();
		tp.setPriority(Thread.MAX_PRIORITY -2);
		tp.start();
		
		//System.out.println("Priority: "+tp.getPriority());
		//tp.setPriority(12);  error for this line bcoz max priority is 10 but here we are setting it to 12
		//tp.setPriority(3);  //default priority is 5 but here we are setting priority to 3
		//tp.setPriority(Thread.MIN_PRIORITY); also get min priority of thread like this
		tp.setPriority(Thread.MAX_PRIORITY -2);
		System.out.println("Priority: "+tp.getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread: "+i);
		}
		
		//To count active threads
		System.out.println("No.of Threads: "+Thread.activeCount());
	}

}
