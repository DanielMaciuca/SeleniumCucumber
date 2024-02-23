package com.daniel.java.Loops.Break;

public class Example {

    public static void main(String[] args) {

        // The break is used to terminate the execution of the loop
        // The execution resumes at the next statement following the loop

        int i = 1;

        while (i <= 5) {
            System.out.println("Iteration: " + i);

            if (i == 3) {
                System.out.println("Breaking the loop at iteration 3");
                break;
            }

            i++; // this is not executed when i = 3 and the loop was broke
            System.out.println("Still inside the loop, the loop will continue until the condition is true" + " " + i);
        }

        System.out.println("Outside of the loop");
    }

}


