package com.daniel.java.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Dog firstDog = new Dog("Daisy");

        System.out.println(firstDog.getName());

        firstDog.setName("DaisyUpdated");

        System.out.println(firstDog.getName());

    }

}


