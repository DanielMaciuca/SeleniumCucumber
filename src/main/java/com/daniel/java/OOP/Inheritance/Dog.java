package com.daniel.java.OOP.Inheritance;

public class Dog extends Animal {
    
    //General information:
    //1. A child class can extend only 1 class but can implement more than 1 interface
    //2. A child interface can extend more than 1 interface
    //3. A parent class can have multiple child classes
    //4. Variables and methods are inherited according to there access modifier
    //4.1 private is not inherited (it cannot be accessed)
    //4.2 protected is inherited and becomes private in the child class
    //4.3 default is inherited only if parent and child classes are in the same package
    //4.4 public is always inherited
    //5. If the parent class has a parametrized constructor the child class needs a matching one
    //6. A child class can access variables (fields) from its parent class and also from its own class

    String breed;

    // Every time when we create an object of a class will call the constructor of its class but ALSO the constructor of the superclass
    // Every constructor in Java has a method, even if we don't see it, this method is super()
    // super() means that you call the constructor of the super class
    //Because the parent class Animal has an explicit constructor, the child class Dog needs a matching constructor as well

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void specificDogMethod() {
        System.out.println("Specific Dog method" + " " + name + " is a " + breed + " and is " + age + " years old.");
    }

    // method eat() from Animal is overridden here in Dog
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void methodDemonstrateAccess(){

        //You can access field and methods in a random method, the same you as you do in the 'public static void main()' method
        
        String a = this.name; // parent
        int b = this.age; // parent
        String c = this.breed; //child
        
        Animal insideAnotherMethodAnimal = new Animal("Goose", 1);
        insideAnotherMethodAnimal.animalMakeSound();

        Dog insideAnotherMethodAnimalDog = new Dog("Max", 10, "woolf");
        insideAnotherMethodAnimalDog.animalMakeSound(); //parent method
                
    }
}


