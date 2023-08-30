package Enum;

public class Main {
    public static void main(String[] args) {

        //Don't need new() keword because it is an enum

        Keys first = Keys.AMOUNT;

        System.out.println(first);

        System.out.println(Keys.NUMBER.keyName);



    }
}