package com.han;

/**
 * Created by HSQ on 2015/12/14.
 */
public class TestLambda {
    public static void main(String[]args){
        /*Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("f");
            }
        };
        Thread  t1 = new Thread(runnable);
        t1.start();*/
        Runnable runnable=()->{
            System.out.println("g");
        };
        Thread  t1 = new Thread(runnable);
        t1.start();
    }
}
