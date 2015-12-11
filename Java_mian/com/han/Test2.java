package com.han;

/**
 * Created by HSQ on 2015/12/10.
 */
class Base1{
    public Base1(){
        System.out.println("Base1");
    }
}
class Sub1 extends Base1{
    public Sub1(){
        super();
        System.out.println("Sub1");
//        super();
    }
}
public class Test2 {
    public static void main(String [] args){
        new Sub1();
        int $$=2;
        System.out.println($$);
        int goto1=3;
       /* final StringBuffer s=new StringBuffer(" J");
        s=new StringBuffer("jge");*/
        final StringBuffer s=new StringBuffer("Hello ");
        System.out.println(s);
        s.append("world");
        System.out.println(s);
    }

}
