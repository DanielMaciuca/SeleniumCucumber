package MathClass;

public class MyClass {

    public static void main(String[] args) {

        // Math class can be used for different numeric operations


        // round function
        int a = Math.round(1.4F);

        System.out.println(a);

        // ceiling function
        int b = (int) Math.ceil(3.1); //this method returns a double, we need to do an explicit cast to store the returned double in a int

        System.out.println(b);

        // floor function
        int c = (int) Math.floor(3.1);

        System.out.println(c);



    }


}
