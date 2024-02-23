package JavaCourse.Loops.ForEach;

public class Example {

    public static void main(String[] args) {

        // Classic way

        String[] textArray = {"First", "Second", "Third"};

        //You can loop through the array elements with the for loop, use the length property to specify how many times the loop should run.

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(textArray[i]);
        }

        // Another way
        // We use for each loops to iterate elements in an array or collections (list, set, map)
        // Limitations: we can't iterate backwards, don't have access to the index of each item

        String[] fruits = {"Mango", "Apple", "Orange"};

        for (String myFruits : fruits) {

            System.out.println(myFruits);
        }

    }
}
