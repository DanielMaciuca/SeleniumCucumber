package com.daniel.java.OOP.Classes;

public class Dog {

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("woof from " + name.toUpperCase());
    }
}
