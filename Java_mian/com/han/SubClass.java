package com.han;
import static java.lang.System.out;
/**
 * Created by HSQ on 2015/12/10.
 */
class Super{
    public int f(){
        return 1;
    }
    int s=5;
}
public class SubClass extends Super{
    /*public float f(){
        return 2f;
    }*/
    public int f(){
        return 2;
    }
    int s=10;
    public static void main(String [] args){
        Super s1= new SubClass();
        int m=s1.f();
        out.println(m);
        out.println(s1.s);
    }
}
