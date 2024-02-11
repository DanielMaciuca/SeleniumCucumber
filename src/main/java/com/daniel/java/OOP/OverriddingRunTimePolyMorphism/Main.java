package com.daniel.java.OOP.OverriddingRunTimePolyMorphism;

public class Main {

    public static void main(String[] args) {

        AdvancedCalculator firstCalc = new AdvancedCalculator();

        // Overridden = same signature (number of parameters and same type, same return type AS in Parent class), different implementation
        // the method from the parent class calculator was Overridden in child class Advanced Calculator -> we needed another implementation
        // IMPORTANT: when java executed the method first tries to find the method in the child class (where the method was overridden). If the method is not in the child class will execute the version from the parent class
        // if eat() is overridden in child class -> execute, if eat() is not in the child class, search in the parent class and execute the eat() method from there
        // Overload can be done on constructors and Methods
        // Overwrite can be done only on methods

        int result = firstCalc.add(2, 4);
        System.out.println(result);

        // but we also need the other method (config()) from the parent class Calculator, so we extended the parent class

        firstCalc.configMethod();

        // Parent class
        Calculator calc = new Calculator();

        int result2 = calc.add(2,4);
        System.out.println(result2);
    }
}
