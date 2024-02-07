package com.daniel.java.OOP.Inheritance;

public class Main {

    public static void main(String[] args) {

        // parent

        Animal firstAnimal = new Animal("Animal1", 123);

        System.out.println(firstAnimal.name + firstAnimal.age);

        //child

        Dog firstDog = new Dog("Nicu", 10, "marspuian");

        System.out.println(firstDog.name + firstDog.age + firstDog.breed);


        //++++++++++++++++++++++++++++++

        // object of child class Dog calls a Field / Instance variables from Parent class Animal
        int ageResult = firstDog.age;
        String nameResult =  firstDog.name;

        System.out.println(ageResult + " " + nameResult);

        //object of type Dog calls a method from the Parent class Animal
        firstDog.animalMakeSound();

        // specific method of child class Dog

        firstDog.specificDogMethod();

        // eat() method from parent Animal class is Overridden in child Dog class.
        // java knows what version of eat() method to execute depending on the object that is calling the method, in this case the version from child Dog class
        firstDog.eat();

        // eat() version from the Animal class
        firstAnimal.eat();

        // instanceof operator shows if an object is an instance of a specific class or the parent class

        System.out.println(firstAnimal instanceof Dog);
        System.out.println(firstAnimal instanceof Animal);
        System.out.println(firstAnimal instanceof Object);

    }

}
