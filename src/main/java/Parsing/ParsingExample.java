package Parsing;

public class ParsingExample {
    public static void main(String[] args) {

//Converting a String to an int

        String s = "102";

        System.out.println(s + 4);

        int b =  Integer.parseInt(s);

        System.out.println(b + 4);

        System.out.println(Integer.parseInt(s) + 4);

//Converting an int to a String

        int a = 100;

        System.out.println(a);

        System.out.println(Integer.toString(a) + 100);

    }

}
