package com.thread;
class Demo extends Thread
{//method
    public void run() {
    for (int i=1; i<=10;i++)
    {
        System.out.println("Samsung model :"+i);
    }
    }
}
public class ConcurrentDemo1 implements Runnable{
//Override run method
    public void run()
    {
        for (int i=1; i<=10;i++)
        {
            System.out.println("Realme model :"+i);
        }
        /* we should write only one method in class if we want other write like Demo class
          for (int i=1; i<=10;i++)
        {
            System.out.println("Samsung model :"+i);
        }
         */
    }
    public static void main(String[] args) {
        //create object
        ConcurrentDemo1 sd = new ConcurrentDemo1();
        // Take Thread support
        Thread t = new Thread(sd);//Runnable Target
        //Call run method by using start method
        t.start();
        
        Demo d = new Demo();
        d.start();
        //To count no.of active Threads
        System.out.println(Thread.activeCount());
        for (int i=1; i<=10;i++)
        {
            System.out.println("OnePlus model :"+i);
        }
    }
}
//depends on context we use the best in 2 ways of creating threads