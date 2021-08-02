package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
        ArrayList<Integer> arrrr = new ArrayList<>();
        LinkedList<String> intas = new LinkedList<>();
        intas.add("AAA");
        intas.add("AAB");
        intas.add("AAC");
        System.out.println(intas);


        MySingleLinkedList<String> strLink = new MySingleLinkedList<>();
        strLink.add("Vlo");
        strLink.add("Hakob");
        strLink.add("Suro");
        strLink.add("Vlo");
        for (int i = 0; i < strLink.size(); i++){
            System.out.println(strLink.get(i));
        }
        System.out.println(strLink + " " + strLink.size());












//        MyArraylist<String> myStrArr = new MyArraylist<>(0);
//        System.out.println(myStrArr.size());
//        myStrArr.add("aaa");
//        myStrArr.add("aab");
//        myStrArr.add("aac");
//        myStrArr.add("aad");
//        System.out.println(" String Array size is " + myStrArr.size());
//
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
//        myStrArr.iterator();
    }
}
