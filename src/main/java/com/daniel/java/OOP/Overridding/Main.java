package com.daniel.java.OOP.Overridding;

public class Main {

    public static void main(String[] args) {

        AdvancedCalculator firstCalc = new AdvancedCalculator();

        // the method from the parent class calculator was Overridden in child class Advanced Calculator -> we needed another implementation
        int result = firstCalc.add(2, 4);
        System.out.println(result);

        // but we also need the other method (config()) from the parent class Calculator, so we extended the parent class

        firstCalc.configMethod();
    }
}
