package com.daniel.java.OOP.StaticFields;

public class Main {

    public static void main(String[] args) {

        // we refer to a static field using the class name
        // the idea is NOT to create objects for static fields/method, but to have a shared value across all objects
        // static variables can be access with the class name, they belong to a class
        // static variables can be accessed also from an object but is not recommended

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();

        obj1.name ="JustAPhone";

        obj1.show();
        obj2.show();

        Mobile.name = "Old";
    }

}
