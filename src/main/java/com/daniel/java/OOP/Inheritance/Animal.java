package com.daniel.java.OOP.Inheritance;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalMakeSound() {
        System.out.println("Animal make sound");
    }

    public void eat() {
        System.out.println("Animal eat");
    }


}
