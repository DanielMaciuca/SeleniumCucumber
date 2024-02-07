package com.daniel.java.OOP.PolyMorphism;

public class Dog  extends Animal{

    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void specificDogMethod(){

        System.out.println("Method that is specific to Dog class");

    }
    // method overridden from Animal class

    public void eat(String food){

        System.out.println("Dog eats" + " " + food);
    }
}
