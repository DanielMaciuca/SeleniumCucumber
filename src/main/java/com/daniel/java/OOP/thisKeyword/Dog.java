package com.daniel.java.OOP.thisKeyword;

public class Dog {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    // with this.keyword we can make a difference between 'local' variable name (which is sent as a parameter for the function) and 'instance variable' name, from the top of the class
    // if you remove this., the variable name will assign the value to itself, because java will interpret both 'name' variables as 'local' variables


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Dog barks");
    }

    // We can use this in any non-static method, not only constructor, setters, getters, etc.
    public void addAge(int age) {

        this.age = age + 100;

    }

}
