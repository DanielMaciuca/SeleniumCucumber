package MortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; //constant
        final byte PERCENT = 100;

        System.out.print("Principal: ");

        Scanner scanner = new Scanner(System.in);

        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");

        float annualInterest = scanner.nextFloat();

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years)");

        byte years = scanner.nextByte();

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
