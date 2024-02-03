package com.daniel.java.OOP.Inheritance;

public class Main {

    public static void main(String[] args) {

        Dog first = new Dog("Nicu", 10, "marspuian");

        System.out.println(first.name + first.age + first.breed);

        Animal aaa = new Animal("Animal1", 123);

        System.out.println(aaa.name + aaa.age);


//        =================/

//        String a = first.name;
//
//        int b = first.age;
//
//        String c = first.breed;
//
//        first.animalMakeSound();
//
//        first.eat();

    }

}
