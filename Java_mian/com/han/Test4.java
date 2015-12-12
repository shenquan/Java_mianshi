package com.han;

/**
 * Created by HSQ on 2015/12/11.
 */
class Test5{

}
public class Test4 {
    public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2){
        ss1.append(" world");
        ss2=ss1;
    }
    public static void main(String[]args){
       /* Integer a=1;
        Integer b=a;
        b++;
        System.out.println("a="+a);
        System.out.println("b="+b);
        StringBuffer s1=new StringBuffer("Hello1");
        StringBuffer s2=new StringBuffer("Hello2");
        changeStringBuffer(s1,s2);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        char a1='a';
        double a2=2;
        System.out.println(a1+a2);
        boolean k=true;
//        int m=(int)k;
short a4= 129;
        byte b4=(byte)a4;
        System.out.println("a4="+a4+"\n"+"b4="+b4);
        short x=1;
//        x=x+1;//false
        x=(short)(x+1);
        x++;
        x+=1;
        System.out.println(x);//x=4*/

        /*Test4 aa =new Test4();
//        System.out.println(aa.getBytes());
        String ab= "知道";
        System.out.println(ab.getBytes().length);
        double xx1=3.25253895389638892580259259295;
        double xx2=3.252538953896388925802592592951;
        if(xx1==xx2)System.out.println("xx1=xx2");
//        Test4 bb=aa;
        Test4 bb=new Test4();
        if(bb.equals(aa)){
            System.out.println("equals:aa=bb");
        }
        String k1=new String("j");
        String k2=new String("j");
        if(k2.equals(k1)){
            System.out.println("k1=k2");
        }
        if(aa==bb)System.out.println("==:aa=bb");
        String j1=new String("f");
        String j2=new String("f");
        if(j1.equals(j2))System.out.println("String:aa=bb");*/

        Test5 aa=new Test5();
        Test5 bb = new Test5();
        int u1=aa.hashCode();
        int u2=bb.hashCode();
        if(u1==u2){
            System.out.println("hashCode():u1=u2");
        }
//        hashSet
    }


}
