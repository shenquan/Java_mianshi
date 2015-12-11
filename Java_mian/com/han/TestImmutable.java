package com.han;

import java.util.Date;

/**
 * Created by HSQ on 2015/12/11.
 */
class ImmutableClass{
    private Date d;
    public ImmutableClass(Date d){
        this.d=d;
    }
    public void printState(){
        System.out.println(d);
    }
}
public class TestImmutable {
    public static void main(String[]args){
        Date d= new Date();
        ImmutableClass immuC=new ImmutableClass(d);
        immuC.printState();
        d.setMonth(5);
        immuC.printState();
    }
}
