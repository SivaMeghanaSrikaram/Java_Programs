package com.thread;
public class SleepDemo  implements Runnable{
    

    public void run()
    {
        
        for(int i=1;i<=10;i++)
        {
            System.out.println("Please Wait "+i);
            try
            {
                Thread.sleep(4000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        
        
    }
    public static void main(String[] args)
    {
        SleepDemo mn = new SleepDemo();
        Thread t = new Thread(mn);
        t.start();
        
    }


}