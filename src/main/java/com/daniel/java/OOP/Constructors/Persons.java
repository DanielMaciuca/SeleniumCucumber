package com.daniel.java.OOP.Constructors;

public class Persons {

    int age;
    String name;

    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Persons(int age, int name) {
        System.out.println("This is a second constructor" + " " + age + " " + name);
        this.age = age;
        this.name = String.valueOf(name);
    }
}
