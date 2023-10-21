package Constructors;

public class Main {
    public static void main(String[] args) {

        //Constructors can be used to create obljects with default values

        // I created an object with default values age = 38 and name = Daniel

        DemoConstructor person = new DemoConstructor(38, "Daniel");

        System.out.println(person.age + person.name);

    }
}

