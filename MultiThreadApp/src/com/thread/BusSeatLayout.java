
package com.thread;

//public class BusSeatLayout extends Thread{
public class BusSeatLayout implements Runnable {
    
    public void run()
    {
        for(int i=1;i<36;i++)
        {
            System.out.println("Seat : "+i);
        }
        
            
        
    }
    public static void main(String[] args)
    {
        //multiple threads for multiple users
        BusSeatLayout b = new BusSeatLayout();
        Thread t = new Thread(b,"Balayya");
        //b.setName("Balayya");//to give thread name
        t.start();
        BusSeatLayout b1 = new BusSeatLayout();
        Thread t1 = new Thread(b1,"Basha Bhai");
        //b1.setName("Basha Bhai");
        t1.start();
        System.out.println(Thread.activeCount());
        //System.out.println(b.getName());//to know default name of thread
        //System.out.println(b1.getName());
    }

}

