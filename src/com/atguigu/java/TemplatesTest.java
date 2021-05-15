package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 *
 */
public class TemplatesTest {
    //模板6
    //prsf
    private static final Customer cust = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 =2;
    //psfs
    public static final String  NATION = "China";

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        //变形:soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("TemplatesTest.main");//soutm
        int num1 = 10;
        int num2 = 10;
        System.out.println("num2 = " + num2);//soutv
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"111","222","333"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        //模板5：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.inn
        if (list == null) {

        }

    }
}
