package com.daniel.java.OOP.Constructors;

public class Persons {

    int age;
    String name;
    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Second constructor using Overloading (different argument types or different number of arguments)
    public Persons(int age, int name) {
        System.out.println("This is a second constructor" + " " + age + " " + name);
        this.age = age + 1;
        this.name = String.valueOf(name);
    }
}
