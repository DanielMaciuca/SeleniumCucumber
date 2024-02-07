package com.daniel.java.OOP.thisAndSuper;

public class Dog extends Animal {

    String breed;

//     This is how a constructor implicit/explicit actually looks like

//     public Dog() {
//        super();
//        breed=null; }

//     Every time when we create an object of a class, it will call the constructor of its class but ALSO the constructor of the superclass
//     Every constructor in java has super() method, even if we don't see it
//     super() means that you call the constructor of the superclass
//     this() means that you call the constructor of the current class
//     This actually means that when you create an object of child class -> its own constructor is called (which has method super () included but not visible, the method is executed) -> the constructor of the superclass is called
//     I think super() mechanism applies only if the constructor of the parent calls in not implicit or not default -> if parent class constructor has parameters, the child constructor needs to have parameters as well because super() needs to have parameters

    public Dog() {
//      super(5);
        super();
        System.out.println("Constructor of the Dog child class");
    }

    public Dog(int age) {
//      super();
        super(age);
//      this().executes the constructor of the same class, the one above
//      this();
        System.out.println("Second Constructor of the Dog child class");
    }
}
