package com.daniel.java.Try;


    public class a {




        public static void main(String[] args) {
            int number = 6;
            checkPrime(number);
        }

        public static void checkPrime(int number) {
            if (number <= 1) {
                System.out.println(number + " is not prime");

            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime");

                }
            }

            System.out.println(number + " is prime");
        }}

