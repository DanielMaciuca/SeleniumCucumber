package com.daniel.java.Parsing;

import java.text.SimpleDateFormat;

public class ParsingExample {
    public static void main(String[] args) {


        // Parsing refers to the process of converting data from one data FORMAT or representation to another.
        // This often involves converting data from a string representation to a specific data type.
        // Parsing is commonly used when dealing with user input, reading data from external sources, or working with data in different formats.

        // Converting a String to an int using Integer class.

        // toString method is a static method of the Integer class.
        // ???toString method is not a method of the Integer class itself, it is inherited from the Object class, which is the root class for all Java classes.
        // The Integer class overrides this method to provide a specific implementation.

        String s = "102";

        System.out.println(s + 4);

        int b = Integer.parseInt(s);

        System.out.println(b + 4);

        System.out.println(Integer.parseInt(s) + 4);

        //Converting an int to a String

        int a = 100;

        System.out.println(a);

        System.out.println(Integer.toString(a) + 100);

        //Converting a String to a double

        String before = "1.1";

        double after = Double.parseDouble(before);

        System.out.println(after);

        //Converting a double to a String

        double y = 32.1;

        y = y + 1; // this actually is doing addition

        System.out.println(y);

        String z = Double.toString(y);

        z = z + 1; // this actually concatenates the values

        System.out.println(z);

        //String to date example -> TO BE CONTINUED

        String dateString = "202.01.12";

        SimpleDateFormat parsedDate = new SimpleDateFormat();



    }

}
