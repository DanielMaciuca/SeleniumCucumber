package JavaCourse.OOP.Abstraction.Interfaces;

public class Main {


    // Interfaces must be implemented using implements keyword, the body of interface methods will be defined in the concrete class
    // One class can implement multiple Interfaces.
    // Interfaces cannot be instantiated
    // Interfaces cannot have constructors
    // Interfaces can have fields, by default they are static final (why: the actual interface is not instantiated, interfaces don't have memory in the heap)
    // The reference variable of the interface (super class) can point to a new object of the child class
    // Interfaces can extend other interfaces


    public static void main(String[] args) {

        Talker taker = new Dog("Gigel", 100, "canis");
        taker.makeSound();

        Animal animal = new Dog("sishila", 200, "woolf");

        animal.hunt();
        animal.eat();

        System.out.println(animal.getBreed());

        Talker cat = new Cat("persana");
        cat.makeSound();

        Talker[] animalCollection = {new Cat("pisi"), new Dog("gigel", 100, "bla"), new Cat("panny")};

        for (Talker t : animalCollection) {

            t.makeSound();
        }

    }
}
