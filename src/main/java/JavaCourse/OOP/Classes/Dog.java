package JavaCourse.OOP.Classes;

public class Dog {

    public String name;
    public int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("woof from " + name.toUpperCase());
    }
}
