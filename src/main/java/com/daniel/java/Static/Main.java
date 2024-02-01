package com.daniel.java.Static;

public class Main {

    public static void main(String[] args) {

        StaticVariables myObject1 = new StaticVariables();
        StaticVariables myObject2 = new StaticVariables();

        System.out.println(myObject1.name + " " + StaticVariables.age); //access to a static variable is done using the class name -> recommended

        myObject2.age = 66;
        myObject2.name = "Sarpe";

        System.out.println(myObject1.name);
        System.out.println(myObject2.name);

        //same value is printed (66)

        System.out.println(myObject1.age);
        System.out.println(myObject2.age);
        System.out.println(StaticVariables.age); //this prints 66 now

        // static variables can be accessed also from an object, not recommended
        // we refer to a static field using the class name
        // the idea is NOT to create objects for static fields/method, but to have a shared value

    }

}
