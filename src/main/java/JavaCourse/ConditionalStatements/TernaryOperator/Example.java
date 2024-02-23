package JavaCourse.ConditionalStatements.TernaryOperator;

public class Example {

    public static void main(String[] args) {

        // result = (condition) ? valueIfTrue : valueIfFalse;

        int x = 10;
        int y = 50;
        int max = (x > y) ? x : y;
        System.out.println(max);

        // Hod to determine if a person belongs to a first class or economy class

        // Method 1:

        int income = 9_000;

        String flightClass;

        if (income > 100000) {
            flightClass = "First";
            System.out.println(flightClass);
        } else {
            flightClass = "Economy";
            System.out.println(flightClass);
        }

        // Method 2 with TERNARY operator

        int secondIncome = 120_000;

        // You do not need to declare "First" and "Second"
        // There are just values that will be assigned, depending of the evaluation.

        String secondFlightClas = (secondIncome > 100000) ? "First" : "Second";

        System.out.println(secondFlightClas);

    }
}
