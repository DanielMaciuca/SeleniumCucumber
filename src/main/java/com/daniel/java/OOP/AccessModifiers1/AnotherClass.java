package com.daniel.java.OOP.AccessModifiers1;

public class AnotherClass {

    public static void main(String[] args) {

        Animal cat = new Animal("Miti", 2);

        // name can be access because is public
        String newName = cat.name;

        // age can't be accessed because is private
        // String newColor = cat.age;

        System.out.println(cat.name + " ");
        cat.makeSound();

    }

}
