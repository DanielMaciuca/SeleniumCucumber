package com.daniel.java.OOP.thisAndSuper;

public class Animal {

    String name;
    int age;

    public Animal() {
        //super(); -> every class in java extends Object class, that's why we have super
        System.out.println("Constructor of the parent Animal class");
    }

    public Animal(int age) {
        //super(); -> every class in java extends Object class, that's why we have super
        System.out.println("Second Constructor of Animal parent class");
    }
}
