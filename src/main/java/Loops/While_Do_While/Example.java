package Loops.While_Do_While;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        // We use While when we don't know exactly how many times a statement will be executed -> this is the difference between for and while

        int i = 2;

        while (i > 0) {

            System.out.println("The value of i is " + i);

            i--;
        }

        // Example WHILE

        Scanner scanner = new Scanner(System.in);

        String input = "";

        System.out.println(input);

        while (!input.equals("quit")) {

            System.out.println("Input");

            input = scanner.next();

        }

        // Example DO WHILE

        // The difference between while and do while:
        // - for 'while' the condition is checked first, if the condition is false, the first loop is not executed
        // - for 'do-while' the condition is checked last, if the condition is false the first loop gets to be executed

        do {

            System.out.println("Input");

            input = scanner.next();

        }

        while (!input.equals("quit"));


    }
}
