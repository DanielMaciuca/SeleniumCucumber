package com.daniel.java.OOP.ObjectClass;

public class Main {

    public static void main(String[] args) {

        Animal firstDog = new Animal();

        firstDog.name = "Rex";
        firstDog.age = 5;

        Animal secondDog = new Animal();

        secondDog.name = "Rex";
        secondDog.age = 5;

        // When you create an object you can see that there are some methods available which actually belong to Object class
        // this actually calls toString method of the Object class, which is the parent of all classes
        // After toString method is overridden in Animal class, it will whatever you need

        System.out.println(firstDog);

        System.out.println(firstDog.toString());

        // Returns false because it uses equals method from Object class
        // If I am overriding equals method it will return true because equals method has another implementation now

        boolean result = firstDog.equals(secondDog);
        System.out.println(result);



    }
}
