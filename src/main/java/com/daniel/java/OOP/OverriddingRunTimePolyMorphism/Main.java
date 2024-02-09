package com.daniel.java.OOP.OverriddingRunTimePolyMorphism;

public class Main {

    public static void main(String[] args) {

        AdvancedCalculator firstCalc = new AdvancedCalculator();

        // the method from the parent class calculator was Overridden in child class Advanced Calculator -> we needed another implementation
        // IMPORTANT: when java executed the method first tries to find the method in the child class (where the method was overridden). If the method is not in the child class will execute the version from the parent class
        // if eat() is overridden in child class -> execute, if eat() is not in the child class, search in the parent class and execute the eat() method from there
        int result = firstCalc.add(2, 4);
        System.out.println(result);

        // but we also need the other method (config()) from the parent class Calculator, so we extended the parent class

        firstCalc.configMethod();
    }
}
