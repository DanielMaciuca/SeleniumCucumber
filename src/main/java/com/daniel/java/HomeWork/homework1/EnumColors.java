package com.daniel.java.HomeWork.homework1;

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

    }

    ;

    public static void main(String[] args) {

        EnumColors firstElemnetnet = EnumColors.RED; // create an enum instance without the new keyword

        System.out.println(firstElemnetnet);

        EnumColors.displayEnum();

    }
}


