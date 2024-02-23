package JavaCourse.Algorithms;

public class abc {

    public static void main(String[] args) {

        abc b = new abc();

        b.subtract(2, 4, 5, 100);

        System.out.println(b.subtract(2, 4));


    }

    public int subtract(int... no) {
        int result = no[0];

        for (int i = 1; i < no.length; i++) {
            result = result - no[i];

        }
        return result;
    }
}
