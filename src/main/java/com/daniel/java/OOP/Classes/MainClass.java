package com.daniel.java.OOP.Classes;

public class MainClass {

    public static void main(String[] args) {

      Animal animal = new Animal("cocos", 10);

        System.out.println(animal.age);
        System.out.println(animal.name);
        animal.makeSound();

        Dog daisy = new Dog ("daisy");
        daisy.makeSound();

        Dog rex = new Dog("rex");
        rex.makeSound();

    }
}
