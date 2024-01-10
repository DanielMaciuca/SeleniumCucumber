package ArraysUtilityClass;

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        //Example 1

        int[] number = {100, 200, 300};

        System.out.println(number); //returns a string which is calculated based on the address of this object


        //Example 2

        int[] numbers2 = {1, 2, 3};

        System.out.println(Arrays.toString(numbers2));

        String[] cars = {"first", "second", "third"};

        System.out.println(Arrays.toString(cars));

        //Example 3 - Equals function

        String[] firstArray = {"first", "second", "third"};
        String[] secondArray = {"first", "second", "third"};
        boolean result = Arrays.equals(firstArray,secondArray);
        System.out.println(result);

        int[] unsortedArray = {101, 22, 202};
        System.out.println("This is the original array" + Arrays.toString(unsortedArray)) ;

        Arrays.sort(unsortedArray);

        System.out.println("This is the sorted array" + Arrays.toString(unsortedArray));

    }
}
