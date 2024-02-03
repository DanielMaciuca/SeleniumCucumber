package com.daniel.java.OOP.Inheritance;

public class Dog extends Animal {

    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void info() {

        System.out.println(name + " is a " + breed + " and is " + age + " years old.");

    }
}


