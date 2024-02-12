package com.daniel.java.OOP.Abstraction.Interfaces;

public class Main {


    // Interfaces must be implemented using implements keyword, the body of interface methods will be defined in the concrete class
    // One class can implement multiple Interfaces.
    // Interfaces cannot be instantiated
    // Interfaces cannot have constructors
    // Interfaces can have fields, by default they are static final (why: the actual interface is not instantiated, interfaces don't have memory in the heap)
    // The reference variable of the interface (super class) can point to a new object of the child class


    public static void main(String[] args) {

        Taker taker = new Animal();
        taker.eat();
        taker.walk();
        taker.fly();
        System.out.println(Taker.name);

    }
}
