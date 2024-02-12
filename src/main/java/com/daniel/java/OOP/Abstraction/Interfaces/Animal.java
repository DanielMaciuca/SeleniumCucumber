package com.daniel.java.OOP.Abstraction.Interfaces;

public class Animal implements Taker {

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void walk() {
        System.out.println("Animal is walking");
    }
}
