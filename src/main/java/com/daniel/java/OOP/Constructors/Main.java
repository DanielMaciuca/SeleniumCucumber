package com.daniel.java.OOP.Constructors;

public class Main {
    public static void main(String[] args) {

        // Constructor is a special method invoked when an object is created
        // Constructors can be used to create objects with default values
        // Classes can have more than 1 constructor using Overloading
        // Constructors don't have a return type and they cannot be: abstract, static or final
        // I created an object with default values age = 38 and name = Daniel

        Persons person = new Persons(38, "Daniel");
        System.out.println(person.age + " " + person.name);

        Persons personTwo = new Persons(100, 25);
        System.out.println(personTwo.age + " " + " " + personTwo.name);

    }
}

