package com.han;

/**
 * Created by HSQ on 2015/12/10.
 */
public class InsertSortAlgorithm {
    //升序
    public static void insertSort(int[] a) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i];
                int j = i;
                if (temp < a[j - 1]) {
                    while (j >= 1 && temp < a[j - 1]) {
                        a[j] = a[j - 1];
                        j--;
                    }
                    a[j] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
//        int [] a= new int[]{13,24,3,45,5};
        int[] a = {7, 3, 19, 40, 4, 7, 1};
        insertSort(a);
        for (int i : a) {
            System.out.println(i);
        }

        int a1 = 2;
        int b1 = 4;
        a1=a1^b1;
        b1=a1^b1;
        a1=a1^b1;
        System.out.println("a1= "+a1+" b1= "+b1);

    }


}
