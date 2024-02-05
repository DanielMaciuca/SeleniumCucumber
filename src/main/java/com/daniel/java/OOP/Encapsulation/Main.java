package com.daniel.java.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        // here we are creating a new object with default values using a constructor
        Dog daisy = new Dog("Daisy", 5);
        System.out.println(daisy.getName() + " " + daisy.getAge());

        // here we update the name and age values of the object using setter methods
        daisy.setName("DaisyUpdated");
        daisy.setAge(12);

        // here we are accessing the name and age values using getter methods
        System.out.println(daisy.getName() + " " + daisy.getAge());

        // cannot be set using an object,because name and age are private.
        // daisy.name = "Updated Name";
        // daisy.age = 12345;


    }

}


