package IF;

public class Example {

    public static void main(String[] args) {

        int temp = 32;
        if (temp > 30) {

            System.out.println("It is a hot dat");
            System.out.println("Drink water");
        } else {
            System.out.println("It is NOT hot outside");

        }


        // The block associated with the FIRST TRUE condition will be executed
        // Once a true condition is found the next conditions are skipped and the associated blocks will not be executed
        int x = 120;

        if (x > 110) {
            System.out.println("Number is greater than 120");
        } else if (x > 50) {
            System.out.println("Number is greater than 50");
        } else if (x > 60) {
            System.out.println("Number is greater then 60");
        }

    }

}
