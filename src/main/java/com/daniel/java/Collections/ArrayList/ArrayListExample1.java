package com.daniel.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {

        //The main difference between an Array and an ArrayList is that ArrayList is flexible, you can remove/add elements, in Arrays this is not possible, you have a fix number of elements
        //

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Mango");


        //fruitList.remove("Banana");

        //fruitList.clear();

        System.out.println(fruitList.contains("Apple123"));

        //get the value by index
        System.out.println(fruitList.get(2));

        //Different from simple arrays
        /*1. You can print all the values
         * 2. You can add/remove how many items you want,
         * the length is not fix.
         */

        System.out.println(fruitList);


    }
}
