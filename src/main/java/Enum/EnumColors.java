package Enum;

import java.util.Arrays;

public enum EnumColors {

    RED,
    BLACK,
    BLUE,
    WHITE;

    // Making this method static because enums cannot be instantiated in the classic way with new() keyword
    // In this way we are able to call the displayEnum() method using the class/enum itself

    public static void displayEnum() {

        System.out.println(Arrays.toString(EnumColors.values()));

        System.out.println(EnumColors.values()); // When you print an array in Java using System.out.println, the default behavior is to invoke the toString() method on the array object. The default implementation of toString() for arrays does not provide a meaningful representation of the array's contents

    }

    public static void main(String[] args) {

        EnumColors firstElement = EnumColors.RED; // create an enum instance

        EnumColors secondElement = EnumColors.BLACK;

        System.out.println(firstElement + " " + secondElement);

        EnumColors.displayEnum();


    }
}


