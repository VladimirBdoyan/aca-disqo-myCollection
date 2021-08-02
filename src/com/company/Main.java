package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        MyArraylist<String> myStrArr = new MyArraylist<>(0);
        System.out.println(myStrArr.size());
        myStrArr.add("aaa");
        myStrArr.add("aab");
        myStrArr.add("aac");
        myStrArr.add("aad");
        System.out.println(" String Array size is " + myStrArr.size());

        myStrArr.remove(1);
        for (int i = 0; i < myStrArr.size(); i++) {
            System.out.println(myStrArr.get(i));
        }

        System.out.println(myStrArr.contains("aab"));
        System.out.println(myStrArr.get(2));
        System.out.println(" String Array size is " + myStrArr.size());
        myStrArr.add("hello");

//        for (int i = 0; i < myStrArr.size(); i++) {
//            System.out.println(myStrArr.get(i));
//        }

        for(String str: myStrArr){
            System.out.println(str);
        }
        System.out.println(myStrArr.get(3));
    }
}
