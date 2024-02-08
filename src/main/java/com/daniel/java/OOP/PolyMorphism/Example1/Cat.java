package com.daniel.java.OOP.PolyMorphism.Example1;

public class Cat extends Animal {

    String fur;

    public Cat(String name, int age, String fur) {
        super(name, age);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void specificCatMethod(){

        System.out.println("Method that is specific to Cat class");
    }

    public void eat(String food){

        System.out.println("Cat eats" + " " + food);

    }
}
