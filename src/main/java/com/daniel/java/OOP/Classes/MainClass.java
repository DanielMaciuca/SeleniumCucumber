package com.daniel.java.OOP.Classes;

public class MainClass {

    public static void main(String[] args) {

      Animal animal = new Animal("cocos", 10);

        System.out.println(animal.age);
        System.out.println(animal.name);

        animal.makeSound();

    }
}
