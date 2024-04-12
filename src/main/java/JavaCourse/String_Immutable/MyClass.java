package JavaCourse.String_Immutable;

public class MyClass {

    public static void main(String[] args) {


        // In Java, strings are immutable, which means that once a String object is created, its CONTENT (the object itself) cannot be changed.

        // In this case java search for the String memory
        // If there is already on object with value cat java will NOT create another object
        // It saves memory because it is NOT creating a new object each and every time
        // You will simply have another reference variable s2 (with same reference value/address as s1 probably?), this means it will point to the same object that contains "Cat" value

        String s1 = "Cat"; // literal string

        String s2 = "Cat";

        // Explicitly creates a new String object, regardless of whether "Cat" is already in the pool

        String s3 = new String("Cat");

        // Here we actually compare the reference value and that the value "Cat" from the object itself
        // s1 == s2 will be true, because reference variables s1 and s2 have the same reference value, this means they point to the same object
        // s1 == s3 will be false because s3 points another String objects, even if the value "Cat" is the same

        if (s1 == s2) {

            System.out.println("Values are equal");

        } else {

            System.out.println("Values are not equal");
        }

    }
}
