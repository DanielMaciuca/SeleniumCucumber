package com.daniel.java.OOP.Encapsulation;


public class Dog {

    // Fields/class variables are marked as private, I cannot use an object (created somewhere else) to change the values
    // Initial state is set using constructors
    // Public getter and setter methods to access and update the value of a private variable
    // We do not want whatever is calling an object to be able to change the properties of that object (for safety reason).
    // So, you can make a property private. If from some reason you need to change the property use can use public helper methods like get and set.

    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Bark" + " " + name.toUpperCase());
    }
}
