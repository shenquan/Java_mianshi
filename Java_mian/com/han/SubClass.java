package com.han;

/**
 * Created by HSQ on 2015/12/10.
 */
class Super{
    public int f(){
        return 1;
    }
}
public class SubClass extends Super{
    public float f(){
        return 2f;
    }
    public static void main(String [] args){
        Super s= new SubClass();
        s.f();
    }
}
