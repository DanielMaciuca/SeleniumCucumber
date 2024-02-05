package com.daniel.java.OOP.Classes;

public class Main {

    public static void main(String[] args) {

//        Animal fistAnimal = new Animal("gaina", 5); // create an object with default attributes using a constructor
//
//        System.out.println(fistAnimal.name + " " + fistAnimal.age);
//
//        String nameUpdated = fistAnimal.name = "gaina updatata";
//
//        int ageUpdated = fistAnimal.age = 20; //update the age attribute
//
//        System.out.println( nameUpdated + " " + ageUpdated);
//
//      Animal secondAnimal = new Animal("cocos", 10);

//        System.out.println(secondAnimal.age);
//        System.out.println(secondAnimal.name);
//        secondAnimal.makeSound();

        Dog daisy = new Dog("daisy", 5); //create an object with default attributes using a constructor
        daisy.makeSound();

        Dog rex = new Dog("rex", 10); // create another object with default attributes
        rex.makeSound();

        // this is not respecting encapsulation principle, anyone can create an object and update its attributes
        daisy.name = "DaisyUpdated"; // update the name attribute using the object
        daisy.age = 7; // update the age attribute using the object
        System.out.println(daisy.name + daisy.age);

    }
}
