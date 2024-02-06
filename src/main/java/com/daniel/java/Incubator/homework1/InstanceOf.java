package com.daniel.java.Incubator.homework1;

//InstanceOf operator used to test whether the object is an instance of the specified type (class or subclass or interface).

public class InstanceOf {

    int x = 100;

    public void myMethod() {
        System.out.println();
    }

    public static void main(String[] args) {

        InstanceOf myObject = new InstanceOf();
        if (myObject instanceof Animal) { // if I use other classes I get the type mismatch - to be investigatedSystem.out.println("This object is an instance of the specified class");

        } else {
            System.out.println("This object in NOT an instance of the specified class");
        }
    }
}
