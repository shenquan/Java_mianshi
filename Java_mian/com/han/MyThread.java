package com.han;

/**
 * Created by HSQ on 2015/12/13.
 */
public class MyThread  implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread body");
    }
    }
 class Testge{
    public static void main(String[]args){
        MyThread thread = new MyThread();
        Thread t=new Thread(thread);
        t.start();
        Thread t2=new Thread(new MyThread());
        t2.start();
        Thread t3=new Thread(new Test388());
        t3.start();
    }
}
class Test388 extends Thread implements Runnable{
    public void run(){
        System.out.println("this is run2()");
    }

}
