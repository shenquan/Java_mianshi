package com.han;

import com.han.enumtest.ConstantsTest;

/**
 * Created by HSQ on 2015/12/9.
 */
class Test {
}

public class ConstructorTest extends Test {
    int k;

    ConstructorTest() {
//super();
    }

    ConstructorTest(int k) {
        this.k = k;
    }
    void ConstructorTest(){
        System.out.println("kk");
    }

    public static void main(String[] args) {
        ConstructorTest t0 = new ConstructorTest();
        ConstructorTest t = new ConstructorTest(3);
        t0.ConstructorTest();
        t.ConstructorTest();
    }
}
