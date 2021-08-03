package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

        MySingleLinkedList<String> strLink = new MySingleLinkedList<>();
        strLink.add("Vlo");
        strLink.add("Hro");
        strLink.add("Hakob");
        strLink.add("Suro");
        strLink.add("Vruyr");
        strLink.add("Davo");
        strLink.add("Hayko");
        strLink.remove(2);

        for (int i = 0; i < strLink.size(); i++) {
            System.out.println(strLink.get(i));
        }
        System.out.println();
        for (String str: strLink){
            System.out.println(str);
        }
        System.out.println("\n" + strLink.contains("Hakob")+ "\n" + strLink.contains("Hro"));
        System.out.println("\n" + strLink.get(2));
        System.out.println("MySingleLinkedList Size is : " + strLink.size());


//        MyArraylist<String> myStrArr = new MyArraylist<>(0);
//        System.out.println(myStrArr.size());
//        myStrArr.add("aaa");
//        myStrArr.add("aab");
//        myStrArr.add("aac");
//        myStrArr.add("aad");
//        System.out.println(" String Array size is " + myStrArr.size());
//        myStrArr.remove(1);
//        for (int i = 0; i < myStrArr.size(); i++) {
//            System.out.println(myStrArr.get(i));
//        }
//
//        System.out.println(myStrArr.contains("aab"));
//        System.out.println(myStrArr.get(2));
//        System.out.println(" String Array size is " + myStrArr.size());
//        myStrArr.add("hello");
//
//
//        for(String str: myStrArr){
//            System.out.println(str);
//        }
    }
}
