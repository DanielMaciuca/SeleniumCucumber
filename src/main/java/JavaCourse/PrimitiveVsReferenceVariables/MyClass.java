package JavaCourse.PrimitiveVsReferenceVariables;

import java.awt.*;

public class MyClass {

    public static void main(String[] args) {

        // Primitive data types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x + " " + y);

        // Reference data types
        Point point1 = new Point(5, 6);

        // Point point2; -- this only created a reference variable/only a pointer, does not create the object

        Point point2 = point1; // This takes the reference variable point2 and points it to another object called point1

        // At this point we have an object called point1 and a reference variable called point2 which is pointing to the same object, point 1.

        point1.x = 100;
        System.out.println(point1 + " " + point2);

    }
}
