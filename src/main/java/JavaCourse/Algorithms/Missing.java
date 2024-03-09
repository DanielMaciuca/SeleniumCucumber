package JavaCourse.Algorithms;

public class Missing {

    public static void main(String[] args) {
        // Array cu N-1 elemente
        int[] array = {2, 3, 1, 5};

        // Număr total de elemente așteptate în array (N)
        int totalElements = array.length + 1;

        // Suma totală a primelor N numere întregi
        int expectedSum = totalElements * (totalElements + 1) / 2;

        // Suma elementelor din array
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum = actualSum + array[i];
        }

//        // Suma elementelor din array
//        int actualSum = 0;
//        for (int num : array) {
//            actualSum += num;
//        }

        // Elementul lipsă
        int missingElement = expectedSum - actualSum;

        // Afișează rezultatul
        System.out.println("Elementul lipsă din array este: " + missingElement);
    }
}
