package com.daniel.homework1;

public class StringsExample {

    public static void main(String[] args) {

        String s1 = "exampleString";
        String s2 = "exampleString";

        String s3 = new String("exampleString");
        String s4 = new String("exampleString");

        // This actually compare the reference value and
        // s1 and s2 are declared literal strings, s1 and s2 are basically reference variable which points to the same object
        // Since == compare the reference value and s1 and 2 are reference variables pointing to the same object -> true.

        System.out.println(s1==s2);

        // This actually compare the object itself, but there is only one object with 2 (s1 and s2) reference variables -> true.
        System.out.println(s1.equals(s2));

        // s3 and s4 are created with 'new' meaning there are two reference variables which point to two different objects
        // This means that reference values are different for s3 and s4 -> False
        System.out.println(s3==s4);

        // I think this compare the objects themselves -> True
        System.out.println(s3.equals(s4));


    }
}
