package JavaCourse.Enum;

public class Main {
    public static void main(String[] args) {

        //Don't need new() keyword because it is an enum

        Keys first = Keys.AMOUNT;

        System.out.println(first);

        System.out.println(Keys.NUMBER.keyName);

        Keys second = Keys.DATE;

        System.out.println(second.getName());

        //this works because elements of an enum are by default 'public static final', you just need to import the element

        System.out.println(Keys.DB_TIMESTAMP.getName());

    }
}