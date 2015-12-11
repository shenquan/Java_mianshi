package com.han;

import com.lzw.OuterClass;

/**
 * Created by HSQ on 2015/12/11.
 */
public class StaticBlock {
    private static int a;
    static{
        StaticBlock.a=4;
        System.out.println(a);
        System.out.println("static block is called");

    }
    public static void main(String[]args){
        Outer.Inner nest = new Outer.Inner();
        nest.accessFromOuter();
        Outer $= new Outer();
        System.out.println($.a);
        OutClass $1=new OutClass();
        $1.testStatic();
    }

}
class OutClass{
    class InnerClass{

    }
    static class InnerClass1{

    }
    public  void testStatic(){
        int i=0;
        System.out.println(i++);
    }
}
class Outer{
    int a;
    static int n=5;
    static class Inner{
        void accessFromOuter(){
            System.out.print("Inner: Outer.n="+n+"\n");
        }
    }
}

