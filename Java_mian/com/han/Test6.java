package com.han;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by HSQ on 2015/12/13.
 */
public class Test6 {
    public static void test() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("aaa", "bbb");
        hm.put("aaa", "ccc");

        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            String val = (String) entry.getValue();
            System.out.println(key + "  " + val);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return "fjejg";
    }

    public static void main(String[] args) {
        test();
        Test6 n = new Test6();
        System.out.println(n);
//        Collections.addAll();
    }
    public boolean equals(){
        return false;
    }

}
