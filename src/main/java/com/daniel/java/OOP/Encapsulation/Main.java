package com.daniel.java.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        // here we are creating a new object with default values using a constructor
        Dog daisy = new Dog("Daisy", 5);
        System.out.println(daisy.getName() + " " + daisy.getAge());

        // here we update the name and age values of the object using setter methods
        // In this way, we are respecting encapsulation principle
        daisy.setName("DaisyUpdated");
        daisy.setAge(12);

        // here we are accessing the name and age values using getter methods
        // In this way, we are respecting encapsulation principle
        System.out.println(daisy.getName() + " " + daisy.getAge());

        // cannot be set using an object,because name and age are private -> encapsulation respected
        // daisy.name = "Updated Name";
        // daisy.age = 12345;


    }

}


