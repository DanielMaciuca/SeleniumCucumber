package com.daniel.java.OOP.Abstraction.Interfaces;

public class Dog extends Animal implements Talker{

    String name;
    int age;

    public Dog(String name, int age, String breed) {
        super(breed);
        this.name = name;
        this.age = age;
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is making sound");
    }
}
