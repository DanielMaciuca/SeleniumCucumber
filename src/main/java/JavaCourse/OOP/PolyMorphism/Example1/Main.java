package JavaCourse.OOP.PolyMorphism.Example1;

public class Main {

    public static void main(String[] args) {

        // Polymorphism
        // 1. Methods can have multiple forms -> overridden
        // 2. But also the objects can have multiple forms -> Animal can be Dog or Cat
        // 4. Animal animalOne = new Cat();
        // 5. If a method is overridden (exists in Animal and Dog) it will always call the most 'specific' version. (the one from Cat)
        // 6. Animal animalOne -> compile time, new Cat() -> run time. At the moment of compilation you don't know what version of the method will be run

        Animal animal = new Animal("Max", 7);
        Dog dog = new Dog("Rex", 5, "wolf");

        animal.makeSound(); //method defined in the parent class
        animal.eat("Meat"); // method from parent class, overridden in child class

        // method defined and implemented in the super class, specific method of the super class
        // object of child class can access the method of the superclass -> inheritance
        dog.makeSound();

        // method overridden in the child class Dog -> It will execute the version of the method eat() from the CHILD class
        // It will execute the method from Dog class, because java knows that dog object is of the Dog class type
        // if eat() method is NOT in the child class will execute the version of the method eat() found in the parent class -> inheritance

        dog.eat("Bobite");

        // specific method in the child Dog class
        dog.specificDogMethod();

        //IMPORTANT========++++++++++RunTimePolyMorphism/DynamicDispatch

        System.out.println("FROM THERE STARTS CASE A");

        // A) The reference variable of a superclass can point (reference) to a NEW object of a child class

        Animal animalOne = new Dog("Gigi", 1, "pit");
        Animal animalTwo = new Cat("miau", 2, "fluff");

        animalOne.makeSound(); // specific method defined in the parent class, runs the version from the parent class

        // method overridden in the child class Dog -> It will execute the version of the method eat() from the CHILD class
        // At Run Time it will decide what version of eat() method will execute -> dynamic dispatch
        // compile time -> is eat() method in parent -> yes, then run time, what kind of object is animalOne? -> it is a Dog, then run the overridden method eat() from child Dog class

        animalOne.eat("Bobite");
        animalTwo.eat("Bobite ude");

        // this will not work because at compile time animalOne reference variable wil search in Animal class the specificMethod() and it will not find it, since is a method of the child class

        // animalOne.specificDogMethod();

        System.out.println("FROM THERE STARTS CASE B");

        // B) The reference variable of a superclass can point (reference) to an EXISTING object of a child class

        Dog dogThree = new Dog("Bubu", 11, "corso");
        Cat catThree = new Cat("Missy", 12, "fluffy");

        // It will execute the overridden version from Dog class
        Animal animalThree = dogThree;
        animalThree.eat("dog food");

        // It will execute the overridden version from Cat class
        animalThree = catThree;
        animalThree.eat("cat food");

        // Another example -> not Working

//        Dog dogThree = new Dog("aa", 5, "bb");
//        Animal animalThree;
//        animalThree = dogThree.eat("aabbcc"); -> not working

        // Collection/Array of objects - FIRST example

        System.out.println("ARRAY OF OBJECTS FIRST EXAMPLE");

        Dog lastDog = new Dog("Bogdan", 5, "aaa");
        Cat lastCat = new Cat("Ana", 5, "bbb");

        // Runs the specific implementation of the overridden eat() method, depending on the object's type
        Animal Collection[] = {lastDog, lastCat};
        Collection[0].eat("mazare");
        Collection[1].eat("cartofi");

        // Collection/Array of objects - SECOND example

        System.out.println("ARRAY OF OBJECTS SECOND EXAMPLE");

        Animal secondCollection[] ={new Dog("aaa", 10, "ceva"), new Dog("bbb", 11, "ceva2"), new Cat("ccc", 12, "ceva3") };

        secondCollection[0].eat("dog food");
        secondCollection[1].eat("dog food");
        secondCollection[2].eat("cat food");

        // instanceof operator shows if an object is an instance of a specific class or the parent class

        Dog newDog = new Dog("nicu", 5, "qqq");
        Animal anotherDog = new Dog("gigel", 12, "www");

        System.out.println(newDog instanceof Dog);
        System.out.println(newDog instanceof Animal);
        System.out.println(newDog instanceof Object);

        System.out.println(anotherDog instanceof Dog); // at compile time -> anotherDog is of type Animal, at running time -> anotherDog is of type Dog (that's why this statement is working)

//    System.out.println(lastAnimal instanceof Animal); // not working

    }
}
