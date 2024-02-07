package com.daniel.java.OOP.PolyMorphism;

public class Animal {

    String name;
    int age;

    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }

    public void eat(String food){

        System.out.println("Animal eats" + " " + food);

    }
}
