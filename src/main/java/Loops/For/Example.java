package Loops.For;

public class Example {
    public static void main(String[] args) {

        // We use for when we know ahead of time how many times we want the statements to be executed

        for (int i = 1; i <= 5; i++) {
            System.out.println("Valoare lui i este " + i + "");
        }

        // Starting from 0

        for (int i = 0; i < 5; i++) {
            System.out.println("Valoare lui i este " + i + "");
        }

        // Looping backwards

        for (int i = 5; i >= 1; i--) {

            System.out.println("Valoare lui i este " + i + "");

        }

        // Using arrays

        String[] textArray = {"First", "Second", "Third"};

        //You can loop through the array elements with the for loop, use the length property to specify how many times the loop should run.

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(textArray[i]);
        }

        // Another way to loop through an array
        //for (type variable : collection{} -> 'Type variable' means the type of the collection itself
        // In my cas a have an array (textArray) of type String

        for (String i : textArray) {
            System.out.println(i);
        }

        // Loop for int array

        int[] numbers = {10, 20, 30};

        for (int displayNumbers : numbers) {
            System.out.println(displayNumbers);
        }

    }

}