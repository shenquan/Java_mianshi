package com.han;

import java.util.*;

/**
 * Created by HSQ on 2015/12/13.
 */
class Person {
    String id;
    String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id=" + id + ",name=" + name;
    }

    /*public boolean equals(Object obj) {
        Person p = (Person) obj;
        if (p.id.equals(this.id)) {
            return true;
        } else
            return false;
    }

    public int hashCode() {
        return id.hashCode();
    }*/
}

public class Test7 {
    public static void test2(){
        System.out.println("Use String as key");
        HashMap<Person, String> hm = new HashMap<>();
        Person p1 = new Person("111", "name1");
        Person p2 = new Person("111", "name2");
//         Collections.addAll(hm,p1,p2);
        hm.put(p1, "address1");
//        Person p2=p1;
        hm.put(p2, "address2");
//Collections.addAll(hm,<p1,"address3">);
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Person key = (Person) entry.getKey();
            String val = (String) entry.getValue();
            System.out.println("key=" + key + "  value=" + val);

        }
    }
    public static void main(String[] args) {
       test2();
//        Aa<> a=null;

    }
}
class Bb{

}
class Aa extends Bb{

}
class F<T extends List>{
    void f(){
        F a=null;
        a=new F<ArrayList>();
        a=new F<LinkedList>();
        F b=new F<ArrayList>();
//        F c=new F<HashMap>();
    }
}
