package com.daniel.java.Try;

public class abc {

    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";

        // Using equals to compare content

        if (str1 == str2) {

            System.out.println("First two are equal");
        }

        if (str1 == str3) {

            System.out.println("First and third are equal");
        }

    }


}

