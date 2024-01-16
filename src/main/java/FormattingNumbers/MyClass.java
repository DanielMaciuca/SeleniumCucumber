package FormattingNumbers;

import java.text.NumberFormat;

public class MyClass {

    public static void main(String[] args) {

        // getCurrencyInstance() this is called a factory method because it creates new objects
        // the method returns a NumberFormat object and stores it in the currency variable

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String result = currency.format(1234567.891); //method returns a string representation of this number formatted as a currency, we need to store it in a string

        System.out.println(result);

        // Returns an instance of the NumberFormat class specialised as formating number as a procent

        String resultPercent = NumberFormat.getPercentInstance().format(0.12); //method chaining

        System.out.println(resultPercent);

    }
}
