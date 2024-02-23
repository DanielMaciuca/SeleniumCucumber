package JavaCourse.ConditionalStatements.If;

public class Example {

    public static void main(String[] args) {


        // If - Else simple statement

        int temp = 32;
        if (temp > 30) {

            System.out.println("It is a hot dat");
            System.out.println("Drink water");
        } else {
            System.out.println("It is NOT hot outside");

        }

        // If - Else multiple statements
        // The block associated with the FIRST TRUE condition will be executed
        // Once a true condition is found the next conditions are skipped and the associated blocks will not be executed
        // If all the condition are false then the last else condition is executed

        int x = 55;

        if (x > 110) {
            System.out.println("Number is greater than 120");
        } else if (x > 50) {
            System.out.println("Number is greater than 50");
        } else if (x > 60) {
            System.out.println("Number is greater then 60");
        } else {
            System.out.println("All the other conditions are false");
        }

        // Independent IF statement allows multiple code blocks to be executed
        int y = 10;

        if (y > 3) {
            System.out.println("Value is grater than 3");
        }
        if (y > 5) {
            System.out.println("Value is greater then 4");
        }
        if (y > 5) {
            System.out.println("Value is greater then 5");
        }


        //Booleans

        boolean myBool = true;

        if (myBool) {
            System.out.println("My boolean is initialized with true");
        } else {
            System.out.println("My boolean is NOT initialized with true ");
        }

        int a = 310;
        int b = 200;
        int c = 300;

        if (a > b) {
            System.out.println("A is grater than B");
        } else if (a > c) {
            System.out.println("A is greater than C");

        } else {
            System.out.println("A si less than B and less than C");
        }
    }

}
