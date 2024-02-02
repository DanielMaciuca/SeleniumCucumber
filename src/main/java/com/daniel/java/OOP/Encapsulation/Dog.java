package com.daniel.java.OOP.Encapsulation;


public class Dog {

    // Fields/class variables are marked as private
    // Initial state is set using constructors
    // Public getter and setter methods to access and update the value of a private variable


    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Bark");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
