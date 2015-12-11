package com.han;

/**
 * Created by HSQ on 2015/12/11.
 */
public class Singleton {
    private static Singleton instance= null;
    private Singleton(){}
    private void fun(){
        System.out.println("58");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public static void main(String []args){
        Singleton a=getInstance();
        a.fun();
    }

}
