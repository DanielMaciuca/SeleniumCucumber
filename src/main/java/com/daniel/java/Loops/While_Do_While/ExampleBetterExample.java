package com.daniel.java.Loops.While_Do_While;

public class ExampleBetterExample {

    public static void main(String[] args) {

        // The difference between while and do while:
        // - for 'while' the condition is checked first, if the condition is false, the first loop is not executed
        // - for 'do-while' the condition is checked last, if the condition is false the first loop gets to be executed

        int i = 6;

        while (i <= 5) {
            System.out.println("While loop: " + i);
            i++;
        }

        int y = 6;

        do {
            System.out.println("Do-while loop: " + y);
            y++;
        } while (y <= 5);
    }


}


