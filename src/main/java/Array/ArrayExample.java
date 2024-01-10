package Array;


public class ArrayExample {
    public static void main(String[] args) {

        String[] textArray = {"Prima", "a", "Doua", "a", "a", "Ultima"};

        //You can loop through the array elements with the for loop, use the length property to specify how many times the loop should run.

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(textArray[i]);
        }

        // Example 1 - Create an array reference

        int[] number; //This is only creating a reference that can 'hold' 3 int numbers, in Java arrays are objects

        // Example 2 - Empty array with 3 elements, all the elements will have the default value 0

        int[]emptyArray = new int[3];

        System.out.println(emptyArray[0] + " " + emptyArray[1] + " " + emptyArray[2]);

        // Example 3 - Create an array

        int[] anotherExample = new int[5];

        anotherExample[0] = 10;
        anotherExample[1] = 20;
        anotherExample[3] = 30;
        anotherExample[4] = 40;
        System.out.println( anotherExample[0] + " " +  anotherExample[1]);

        // Example 4 - Create another array

        int[] lastExample;
        lastExample = new int[2];

        lastExample[0] = 11;
        lastExample[1] = 22;

        System.out.println(lastExample[0] = lastExample[1]);

        // Example 5



    }
}


