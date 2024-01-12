package Parsing;

public class ParsingExample {
    public static void main(String[] args) {


        //Parsing refers to the process of converting data from one FORMAT or representation to another.
        // This often involves converting data from a string representation to a specific data type.
        // Parsing is commonly used when dealing with user input, reading data from external sources, or working with data in different formats.

        //Converting a String to an int using Integer class

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

        y = y + 1;

        System.out.println(y);

        String z = Double.toString(y);

        z = z + 1; // this actually concatenates the values

        System.out.println(z);

    }

}
