package com.daniel.java.OOP.PolyMorphism;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 5, "wolf");
        Animal animal = new Animal("Max", 7);

        Animal secondAnimal = new Dog("Bruno", 7, "potaie");

//        dog.makeSound(); // method defined and implemented in the super class

        dog.eat("Bobite"); // method overridden in the child class Dog

        animal.eat("Meat");

        secondAnimal.eat("Paine");



    }
}
