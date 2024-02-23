package JavaCourse.OOP.Constructors;

public class Persons {

    int age;
    String name;

    //Default constructor
    public Persons() {
        age = 100;
        name = "Popescu";
    }

    // Second constructor using Overloading (different argument types or different number of arguments)
    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Third constructor using Overloading (different argument types or different number of arguments)
    public Persons(int age, int name) {
        System.out.println("This is a third constructor" + " " + age + " " + name);
        this.age = age + 1;
        this.name = String.valueOf(name);
    }
}
