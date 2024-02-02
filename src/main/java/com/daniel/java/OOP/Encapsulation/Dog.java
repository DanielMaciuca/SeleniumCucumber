package com.daniel.java.OOP.Encapsulation;


public class Dog {

    // Fields/class variables are marked as private
    // Initial state is set using constructors
    // Public getter and setter methods to access and update the value of a private variable
    // We do not want whatever is calling an object to be able to change the properties of that object (for safety reason).
    // So, you can make a property private. If from some reason you need to change the property use can use public helper methods like get and set.

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
