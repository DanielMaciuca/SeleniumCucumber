package com.daniel.java.OOP.Classes;

public class MainClass {

    public static void main(String[] args) {

      Animals cat = new Animals("cocos", 10);

        System.out.println(cat.age);
        System.out.println(cat.name);

        cat.bark();

    }
}
