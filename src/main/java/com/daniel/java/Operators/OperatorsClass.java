package com.daniel.java.Operators;

public class OperatorsClass {

    public static void main(String[] args) {

        // ++i -> increments the value before the expression is calculated
        // i++ -> expression is calculated and then the value is implemented

        int i = 3;

        int result = ++i;

        System.out.println(result);

        int y = 2;

        int result2 = ++y*4;

        System.out.println(result2);

        int z = 3;

        int result3 = ++z*4/z--;

        System.out.println(z);

        double q = 5;

        // int j = q / 2; will not work

        double j = q / 2;

        System.out.println(j);

        System.out.println("This is " + 2 + 1 + "something");

    }
}
