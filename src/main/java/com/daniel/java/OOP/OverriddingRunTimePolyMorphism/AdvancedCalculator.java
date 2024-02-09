package com.daniel.java.OOP.OverriddingRunTimePolyMorphism;

public class AdvancedCalculator extends Calculator {

   @Override
    public int add(int n1, int n2) {
        int n3 = 3;
        return n1 + n2 + n3;
    }

}
