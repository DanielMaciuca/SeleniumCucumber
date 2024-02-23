package DanielCalculator.test;

import DanielCalculator.basic.Basic;
import DanielCalculator.basic.BasicOperations;

public class TestCalculator {

    public static void main(String[] args) {

//        ExpertOperations expert = new Expert();

//        System.out.println(expert.add(2,3));

        BasicOperations b = new Basic();

//        System.out.println(b.add(4, 8));

//        System.out.println(b.add(new int[]{100, 200, 300}));

        System.out.println(b.add(100, 200, 300, 400));

        System.out.println(b.subtract(2, 5, 9));

        System.out.println(b.multiply(2, 6));

        // Output 049999999999999 because of type double. You can use instead class Big Decimal/Big Double when you need to do arithmetic operations with precision
        System.out.println(b.multiply(3.5, 2.3));

        System.out.println(b.divide(10, 3));

        System.out.println(b.divide(5, 0));


    }
}
