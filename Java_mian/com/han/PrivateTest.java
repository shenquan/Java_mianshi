package com.han;
import static java.lang.System.out;
/**
 * Created by HSQ on 2015/12/9.
 */
public class PrivateTest {
    private int i= 5;
    private int fun(){
        return i;
    }
    public static void main(String []args){
        PrivateTest t= new PrivateTest();
        out.println(t.i);
        out.println(t.fun());

    }
}
