package com.atguigu.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


public class HelloWorld<publ> {

    public static void main(String[] args) {
        //region Description
        System.out.println("HelloWorld!!");
        //endregion

        ArrayList list = new ArrayList();

        System.out.println();

        

        System.out.println("args = [" + args + "]");


        System.out.println("HelloWorld.main");

        Date date = new Date();


        }
        public static void method1(){
            try {
                FileInputStream fis = new FileInputStream("hello.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

}