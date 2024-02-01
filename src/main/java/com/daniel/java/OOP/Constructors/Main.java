package com.daniel.java.OOP.Constructors;

public class Main {
    public static void main(String[] args) {

        // Constructors can be used to create objects with default values

        // I created an object with default values age = 38 and name = Daniel

        Persons person = new Persons(38, "Daniel");

        System.out.println(person.age + " " + person.name);

    }
}

