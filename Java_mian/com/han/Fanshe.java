package com.han;

/**
 * Created by HSQ on 2015/12/10.
 */
class Base{
    public void f(){
        System.out.println("Base");
    }
}
class Sub extends Base{
    public void f(){
        System.out.println("Sub");
    }
}
public class Fanshe {
    public static void main(String[] args){
        try{
            /*Sub k= new Sub();
            Class c= k.getClass();*/
//            Class c = Class.forName("Sub");//报错，
            Class c = Class.forName("com.han.Sub");//
            Sub b = (Sub)c.newInstance();
            b.f();

            Class d = Sub.class;
            Sub e = (Sub)d.newInstance();
            e.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
