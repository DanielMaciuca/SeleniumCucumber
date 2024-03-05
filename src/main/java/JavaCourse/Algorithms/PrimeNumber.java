package JavaCourse.Algorithms;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 2;
        int flag = 0;

        if (number <= 2) {

            System.out.println("Number is not prime");

        } else {

            for (int i = 2; i < number; i++){

                System.out.println(i);
            }

        }

    }

}
