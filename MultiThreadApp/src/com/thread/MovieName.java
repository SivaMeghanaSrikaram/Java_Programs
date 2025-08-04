package com.thread;
public class MovieName implements Runnable{
    

    public void run()
    {
        if (Thread.currentThread().getName().equals("Balayya"))
        {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Balayya Movie "+i);
            
        }
        }
        else {
            
        for(int j=1;j<=10;j++)
        {
            System.out.println("Chiru Movie "+j);
            
        }
        }
        
    }
    public static void main(String[] args)
    {
        MovieName mn = new MovieName();
        //Thread t = new Thread(mn,"Balayya");
        //t.start();
        Thread t = new Thread(mn,"Chiru");
        t.start();
        
    }

}