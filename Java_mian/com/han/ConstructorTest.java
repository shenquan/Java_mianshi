package com.han;

/**
 * Created by HSQ on 2015/12/9.
 */
class Test {
    public void fun(){
        System.out.println("mm");
    }
}

public class ConstructorTest extends Test {
    int k;

    ConstructorTest() {
//super();
    }

    ConstructorTest(int k) {
        this.k = k;
    }

    void ConstructorTest() {
        System.out.println("kk");
    }

    public static void main(String[] args) {
        ConstructorTest t0 = new ConstructorTest();
        ConstructorTest t = new ConstructorTest(3);
        t0.ConstructorTest();
        t.ConstructorTest();
        //反射
        try {
            Class c= Class.forName("Test");
            Test x = (Test)c.newInstance();
            x.fun();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Class c1 = Test.class;
    }
}
