package JavaCourse.OOP.Abstraction.AbstractExample1;

public class Main {

    // Data abstraction is the process of hiding certain details and showing only essential information to the user
    // Use an abstract class with subclasses where there is a hierarchy, a logical connection between the abstract class and subclass
    // Abstraction can be achieved with either abstract classes or interfaces
    // An abstract class can have both Implemented and Not Implemented methods
    // An abstract car cannot be instantiated
    // Members of an abstract class can have different access modifiers and they can be static as well
    // An abstract class Can have a constructor (to force the children classes to have a constructor (with super()) which matches the parent class constructor (abstract class in this case))
    // It is Not mandatory for an Abstract class to have abstract method, it can have only implemented methods
    // An abstract method is a method declared without an implementation
    // Al methods defined abstract must always be IMPLEMENTED (defined, written) in the subclass (concrete class), thus making overriding compulsory OR either make subclass itself abstract
    // What happens if in the super class you have 2 abstract methods but you want to implement only 1 of them in the child class? Then you make the child class abstract you create another concrete class which will extend the abstract child class
    public static void main(String[] args) {

        // Cannot create an instance of the abstract class

        //  Car newCar = new Car();

        // Normal instance of child class Bmw
        Bmw firstBmw = new Bmw("Prima masina", "200");
        firstBmw.drive("ceva");

        // You can use the reference variable of the Abstract class (super class) to create an object of the child class and execute the overridden method of that specific class
        Car carOne = new Bmw("Second car", "500");
        carOne.drive("inca ceva");

    }
}
