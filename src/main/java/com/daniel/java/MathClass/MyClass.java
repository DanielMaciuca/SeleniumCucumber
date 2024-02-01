package com.daniel.java.MathClass;

public class MyClass {

    public static void main(String[] args) {

        // Math class can be used for different numeric operations

        // round function
        int a = Math.round(1.4F);

        System.out.println(a);

        // ceiling function
        int b = (int) Math.ceil(3.1); //this method returns a double, we need to do an explicit cast to store the returned double in a int

        System.out.println(b);

        // floor function
        int c = (int) Math.floor(3.1);

        System.out.println(c);

        // max function

        double d = Math.max(1.1,1.2);

        System.out.println(d);


        int e = Math.max(2,3);

        System.out.println(e);

        // random function

        int  f = (int) Math.round(Math.random() * 100);

        int  g = (int) (Math.random() * 100);

        System.out.println(f + " " + g);

    }


}
