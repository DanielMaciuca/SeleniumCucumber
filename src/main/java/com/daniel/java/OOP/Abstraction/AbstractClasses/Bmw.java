package com.daniel.java.OOP.Abstraction.AbstractClasses;

public class Bmw extends Car {

    String motor;

    public Bmw(String name, String motor) {
        super(name);
        this.motor = motor;
    }

    // Method from abstract class
    @Override
    public void drive(String style) {

        System.out.println("This is the implementation of the drive() method insied the Bmw child class" + " " + getName());

    }
// Every abstract method from the abstract class need to be implemented in the subclass (concrete class)
//    @Override
//    void power() {
//
//    }
}
