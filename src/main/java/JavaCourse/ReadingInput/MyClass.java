package JavaCourse.ReadingInput;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // from where do we want to read the data, in this case from a terminal window.

        byte age = input.nextByte(); // reading data

        System.out.println("You are" + " " + age);

        String name = input.next();

        System.out.println("Your name is" + " " + name);

    }
}
