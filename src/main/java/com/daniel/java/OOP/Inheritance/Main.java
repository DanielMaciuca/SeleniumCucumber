package com.daniel.java.OOP.Inheritance;

public class Main {

    public static void main(String[] args) {

        Dog firstDog = new Dog("Nicu", 10, "marspuian");

        System.out.println(firstDog.name + firstDog.age + firstDog.breed);

        Animal aaa = new Animal("Animal1", 123);

        System.out.println(aaa.name + aaa.age);

//++++++++++++++++++++++++++++++

        // field / instance variables from parent class Animal
        int ageResult = firstDog.age;
        String nameResult =  firstDog.name;

        System.out.println(ageResult + " " + nameResult);

        //object of type Dog calls a method from the Parent class Animal
        firstDog.animalMakeSound();

        // eat() method from parent Animal class is overridden in child Dog class.
        // java knows what version of eat() method to execute depending on the object that is calling the method, in this case the version from child Dog class
        firstDog.eat();


    }

}
