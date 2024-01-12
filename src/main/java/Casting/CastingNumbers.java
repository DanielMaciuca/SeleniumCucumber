package Casting;

public class CastingNumbers {

    public static void main(String[] args) {

        //Widening - Implicit casting

        //Widening casting happens automatically by the Java compiler when there is no risk of losing information in the conversion.
        //It involves converting a value from a smaller data type to a larger data type.
        //For example, converting an int to a long or a float to a double

        //byte > short > int > long > float > double

        short x = 1;

        int y = x + 2;

        System.out.println(x + " " + y);

        double firstNumber = 1.1;
        double secondNumber = firstNumber + 2; //java will automatically cast integer 2 to 2.0, and then 2.0 will be added

        System.out.println(firstNumber + " " + secondNumber);

        //Narrowing - Explicit Casting

        //Narrowing casting requires explicit notation by the programmer, as there is a potential risk of losing information during the conversion.
        //It involves converting a value from a larger data type to a smaller data type.
        //For example, converting a double to an int.

        double firstExpNumber = 1.1;
        int secondExpNumber = (int) firstExpNumber + 2;
        System.out.println(firstExpNumber + " " + secondExpNumber);




    }
}
