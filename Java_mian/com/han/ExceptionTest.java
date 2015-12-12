package com.han;

/**
 * Created by HSQ on 2015/12/12.
 */
public class ExceptionTest {
    public static void main(String[]args){
        try{
            int i=0;
//            System.exit(1);
            return ;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("yes");
        }

    }

}
