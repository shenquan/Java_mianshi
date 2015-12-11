package com.han;

import com.han1.ObjectInstance;

/**
 * Created by HSQ on 2015/12/11.
 */
public strictfp class InstanceTest {
    public static void main(String[]args){
        float f=(float)1.0;
        float g1= 4F;
        System.out.println(g1);
        String s= "Hello";
        int [] a= {1,2};
        int c=9;
        Integer g= new Integer(9);

        if(s instanceof String){
            System.out.println("true1");
        }

        if(s instanceof Object)
            System.out.println(true);
        if(a instanceof int[])
            System.out.println("true2");
        if(null instanceof Object)
            System.out.println("true3");
//        if(c instanceof Object)
//            System.out.println("true");
        if(g instanceof Integer){
            System.out.println("true4"+g);
        }
    }
}
strictfp class c{
strictfp double f(){
    return 33d;
}
}