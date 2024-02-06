package com.daniel.java.OOP.Constructors;

public class Main {
    public static void main(String[] args) {

        // Constructor is a special method invoked when an object is created
        // Constructors can be used to create objects with default values
        // You can have implicit constructors and explicit constructors (implicit constructor is not defined)
        // Classes can have more than 1 constructor using Overloading
        // Constructors don't have a return type and they cannot be: abstract, static or final
        // I created an object with default values age = 38 and name = Daniel

        // When this object is created the first constructor will be called (based on the parameter types)
        Persons person = new Persons(38, "Daniel");
        System.out.println(person.age + " " + person.name);

        // When this object is created the second constructor will be called
        Persons personTwo = new Persons(100, 25);
        System.out.println("Print statement outside the constructor" + " " + personTwo.age + " " + " " + personTwo.name);

    }
}

