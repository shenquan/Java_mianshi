package com.han;

/**
 * Created by HSQ on 2015/12/10.
 */
abstract class A{
    private void f() {

    }
//    abstract final void gh();
   /* public static void main(String []args){
        System.out.println("f");

    }*/
abstract void g();
    private int i;
}
/*class B extends A{
    @Override
    public void f() {

    }
}*/
interface C{
   void f();
    public static void main(String []args){
        System.out.println("f");

    }
    static void method(double d1){

    }
    int a=1;
//    public final double f();
}
class D implements C{
    @Override
    public void f() {

    }
}
public class AbstractTest {
}
class X{
    final int i=-3;
   public class Y{
       /*static void fun(){

        }*/
//        static int i;
    }

}
class JJ{
    int i;
    JJ(int i){
        this.i=i;
    }
}