package JavaCourse.Algorithms;

public class BiggestElementArray {

    public static void main(String[] args) {

        int[] array = {5, 2, 4, 11, 7};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {

                max = array[i];

            }

        }
        System.out.println(max);

    }
}
