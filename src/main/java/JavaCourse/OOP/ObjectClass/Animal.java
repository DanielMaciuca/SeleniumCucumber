package JavaCourse.OOP.ObjectClass;

import java.util.Objects;

public class Animal {

    public String name;
    int age;

    // Press Alt + Insert and Override toString, equals, hashCode methods

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void makeSound() {
        System.out.println("Dog make sound");
    }
}

