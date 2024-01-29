package MortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; //constant
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {

            System.out.println("Period (Years)");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

    }
}

