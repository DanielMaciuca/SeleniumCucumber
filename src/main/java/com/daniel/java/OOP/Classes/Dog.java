package com.daniel.java.OOP.Classes;

public class Dog {

    String name;

    Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("woof from " + name.toUpperCase());
    }
}
