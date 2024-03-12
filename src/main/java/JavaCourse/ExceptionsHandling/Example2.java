package JavaCourse.ExceptionsHandling;

public class Example2 {
    public static void main(String[] args) {

        // Exceptions can be added at the caller level -> when you call the function which has the code that can trigger the exception

        try {
            getException();

        } catch (Exception nfr) {
            nfr.printStackTrace();
            System.out.println("Exception happens I am inside catch block");
        }

        System.out.println("Just some cod to be executed after the catch");
    }

    public static void getException() {

        int number = Integer.parseInt("pats");
    }

}
