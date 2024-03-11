package JavaCourse.ExceptionsHandling;

public class Main {
    public static void main(String[] args) {

        // If everything work ok, the catch block will not be executed
        // If something goes wrong it, executed the catch block
        // If we DON'T have a try-catch and an exception occurs, the execution will stop and the remaining code will NOT be executed

        int i = 0;
        int j = 0;


        try {
            j = 18 / i;
        } catch (Exception e) {

            e.printStackTrace(); // print the exception itself

            System.out.println("Something went wrong");
        }
        System.out.println("Initial value of j:" + j);
        System.out.println("Hello");
    }

}
