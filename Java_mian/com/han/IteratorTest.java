package com.han;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HSQ on 2015/12/13.
 */
class X1{
    public String toString(){

       return "X1";
    }
}
public class IteratorTest {
    public static void main(String []args){
        List <String> ll = new LinkedList<>();
        ll.add("first");
//        ll.add("first");
        Collections.addAll(ll,"second","third","four");
        for(Iterator<String> iter=ll.iterator();iter.hasNext();){
            String str=iter.next();
            System.out.println(str);
        }

        List<X1> ff=new LinkedList<>();
        X1 a=new X1();
        X1 b=new X1();
        Collections.addAll(ff,a,b);
        Iterator iter=ff.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

}
