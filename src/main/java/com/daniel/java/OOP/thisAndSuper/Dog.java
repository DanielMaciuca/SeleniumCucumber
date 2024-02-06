package com.daniel.java.OOP.thisAndSuper;

public class Dog extends Animal {

    String breed;

//     This is how a constructor implicit/explicit actually looks like

//     public Dog() {
//        super();
//        breed=null; }

//     Every constructor in java has super() method, even if we don't see it
//     super() means that you call the constructor of the superclass
//     This actually means that when you create an object of child class -> its own constructor is called (which has method super (), of course it is executed) -> the constructor of the superclass is called
//     Every time when we create an object of a class, it will call the constructor of its class but ALSO the constructor of the superclass

    public Dog() {
//      super(5);
        super();
        System.out.println("Constructor of the Dog child class");
    }

    public Dog(int age) {
//      super();
        super(age);
        System.out.println("Second Constructor of the Dog child class");
    }
}
