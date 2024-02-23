package JavaCourse.OOP.Classes;

public class Main {

    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        Animal secondAnimal = new Animal();

        // the name and age are directly initialized at class level with value kiki and 1.
        // the problem with this is that every Animal object that will be created will have these values by default

        System.out.println(firstAnimal.name + " " + firstAnimal.age);
        System.out.println(secondAnimal.name + " " + secondAnimal.age);

        // updating the attributes of the firstAnimal object

        firstAnimal.name = "First Animal Name Update";
        firstAnimal.age = 100;
        System.out.println(firstAnimal.name + " " + firstAnimal.age);

        // updating the attributes of the secondAnimal object

        secondAnimal.name = "Second Animal Name Updated";
        secondAnimal.age = 200;
        System.out.println(secondAnimal.name + " " + secondAnimal.age);

        // Dog class

        Dog daisy = new Dog("daisy", 5); //create an object with default attributes using a constructor
        daisy.makeSound();

        Dog rex = new Dog("rex", 10); // create another object with default attributes
        rex.makeSound();

        // this is NOT respecting encapsulation principle, anyone can create an object and update its attributes
        daisy.name = "DaisyUpdated"; // update the name attribute using the object
        daisy.age = 7; // update the age attribute using the object
        System.out.println(daisy.name + daisy.age);

    }
}
