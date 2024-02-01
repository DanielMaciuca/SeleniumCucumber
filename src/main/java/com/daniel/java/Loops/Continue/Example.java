package com.daniel.java.Loops.Continue;

public class Example {

    // Continue statement in Java is used to skip the rest of the code inside a loop for the current iteration and move on to the next iteration

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                System.out.println("Skipping iteration 3 using continue");
                i++;
                continue;
            }

            System.out.println("Iteration: " + i); // when i==3 this part of the code is skipped
            i++;
        }

        System.out.println("Outside of the loop");
    }
}


