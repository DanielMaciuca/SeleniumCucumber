package com.daniel.java.OOP.Abstraction.Interfaces;

public interface Taker {

    public static final String name = "Rex";
    
    public static final int age = 0;

    public abstract void eat();

    public abstract void walk();

    default public void fly(){

        System.out.println("Default method defined in the interface");

    }


}
