package com.daniel.java.OOP.PolyMorphism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Max", 7);
        Dog dog = new Dog("Rex", 5, "wolf");

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

        System.out.println("FROM THERE STARTS CASE A");

        // A) The reference variable of a superclass can point (reference) to a NEW object of a child class

        Animal animalOne = new Dog("Gigi", 1, "pit");

        animalOne.makeSound(); // specific method defined in the parent class, runs the version from the parent class

        // method overridden in the child class Dog -> It will execute the version of the method eat() from the CHILD class
        // At Run Time it will decide what version of eat() method will execute -> dynamic dispatch
        // compile time -> is eat() method in parent -> yes, then run time, what kind of object is animalOne? -> it is a Dog, then run the overridden method eat() from child Dog class

        animalOne.eat("Bobite");

        // this will not work because at compile time animalOne reference variable wil search in Animal class the specificMethod() and it will not find it, since is a method of the child class

        // animalOne.specificDogMethod();

        System.out.println("FROM THERE STARTS CASE B");

        // B) The reference variable of a superclass can point (reference) to an EXISTING object of a child class

        Dog dogTwo = new Dog("Bubu", 11, "corso");
        Cat catTwo = new Cat("Missy", 12, "fluffy");

        // It will execute the overridden version from Dog class
        Animal animalTwo = dogTwo;
        animalTwo.eat("dog food");

        // It will execute the overridden version from Cat class
         animalTwo = catTwo;
         animalTwo.eat("cat food");

        // Another example -> not Working

//        Dog dogThree = new Dog("aa", 5, "bb");
//        Animal animalThree;
//        animalThree = dogThree.eat("aabbcc"); -> not working

    }
}
