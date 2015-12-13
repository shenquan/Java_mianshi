package com.han;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HSQ on 2015/12/13.
 */
public class Test8 {
    public static void main(String[]args){
        List<Integer> list = new LinkedList<Integer>();
        int array[]={1,2,7,3};
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Collections.sort(list);
        for(int i=0;i<array.length;i++){
            System.out.println(list.get(i));
        }
    }
}
