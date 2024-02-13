package com.daniel.java.OOP.Abstraction.Interfaces;

public interface Talker {

    String species = "NonHuman";

    public abstract void makeSound();

    default public void defaultInterfaceMethod() {

        System.out.println("Default method defined in the interface");

    }
}
