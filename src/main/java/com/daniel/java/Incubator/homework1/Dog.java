package com.daniel.java.Incubator.homework1;

public class Dog implements Animal {

    public void Move() {

        System.out.println("Dog is moving - Implementation of a method from interface Animal");

    }

    public static void main(String[] args) {

        Dog wolf = new Dog();

        wolf.Move();


    }

}
