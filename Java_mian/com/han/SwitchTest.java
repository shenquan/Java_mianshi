package com.han;

/**
 * Created by HSQ on 2015/12/11.
 */
public class SwitchTest {
    public static void main(String[]args) {
//        String a = new String("a");
        String b= "";
//        char b = 'b';
//        int b=1;
        switch (b) {
            case "a":
                System.out.println("a");
            case "":
                System.out.println("b");
        }
    }

}
