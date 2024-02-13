package com.daniel.java.OOP.Abstraction.Interfaces;

public class Cat extends Animal implements Talker{

    public Cat(String breed) {
        super(breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is making sound");
    }
}
