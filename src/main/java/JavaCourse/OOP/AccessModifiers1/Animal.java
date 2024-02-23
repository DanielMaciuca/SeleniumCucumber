package JavaCourse.OOP.AccessModifiers1;

public class Animal {

    public String name;
    private int age;

    Animal(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal" + " " + name.toUpperCase() + " " + "makes a big sound");
    }

    public void eat(String name, int age){

    }
}
