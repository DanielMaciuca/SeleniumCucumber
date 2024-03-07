package JavaCourse.Algorithms;

public class SumElementsFromArray {

    public static void main(String[] args) {

        int[] number = {10, 5, 7, 3};
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum =+ sum + number[i];

        }

        System.out.println(sum);

        // Interesting

        int[] number2 = {10, 5, 7};
        int q = 2;
        System.out.println(number2[q]);
    }
}
