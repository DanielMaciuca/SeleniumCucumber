package com.daniel.java.OOP.PolyMorphism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Max", 7);
        Dog dog = new Dog("Rex", 5, "wolf");
        Cat cat = new Cat("Miti", 2, "persana");

        animal.makeSound(); //method defined in the parent class
        animal.eat("Meat"); // method from parent class, overridden in child class

        // method defined and implemented in the super class, specific method of the super class
        // object of child class can access the method of the superclass -> inheritance
        dog.makeSound();

        // method overridden in the child class Dog -> It will execute the version of the method eat() from the CHILD class
        // It will execute the method from Dog class, because java knows that dog object is of the Dog class type
        // if eat() method is NOT in the child class will execute the version of the method eat() found in the parent class -> inheritance

        dog.eat("Bobite");

        // specific method in the child Dog class
        dog.specificDogMethod();

        //IMPORTANT========++++++++++RunTimePolyMorphism/DynamicDispatch

        // The reference variable of a superclass can point (reference) to a NEW object of a super class

        Animal animalOne = new Dog("Gigi", 1, "pit");

        animalOne.makeSound(); // specific method defined in the parent class, runs the version from the parent class

        // method overridden in the child class Dog -> It will execute the version of the method eat() from the CHILD class
        // At Run Time it will decide what version of eat() method will execute -> dynamic dispatch

        animalOne.eat("Bobite");

        // this will not work because at compile time animalOne reference variable wil search in Anima class the specificMethod() and it will not find it, since is a method of the child

        // animalOne.specificDogMethod();

    }
}
