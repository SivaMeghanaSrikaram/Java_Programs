package com.thread;
public class SequentialDemo {

    //method
    void productDetails()
    {
        for (int i=1; i<=10;i++)
        {
            System.out.println("Realme model :"+i);
        }
    }
    public static void main(String[] args) {
        //create object
        SequentialDemo sd = new SequentialDemo();
        sd.productDetails();
        for (int i=1; i<=10;i++)
        {
            System.out.println("OnePlus model :"+i);
        }

    }

}