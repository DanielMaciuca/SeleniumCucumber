package com.daniel.java.OOP.Abstraction.Interfaces;

public class Animal {

    String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void hunt() {
        System.out.println("Animal is hunting");

    }
}
