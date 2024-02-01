package com.daniel.java.LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

//        Logical AND (&&): Returns true if both conditions are true.
//        Logical OR (||): Returns true if at least one condition is true.
//        Logical NOT (!): Returns the opposite boolean value. If the condition is true, ! operator makes it false; if it's false, ! operator makes it true

        int x = 10;

        int y = 20;

        boolean result = x <= 10 && y <= 19;

        System.out.println(result);

        int temperature = 10;

        boolean warmth = temperature > 22 && temperature < 30;

        System.out.println(warmth);

        boolean hasHighIncome = true;

        boolean hasGoodScore = false;

        boolean hasCriminalRecord = false;

        boolean isEligible = (hasGoodScore || hasHighIncome) && !hasCriminalRecord;

        System.out.println(isEligible);

        boolean example = true;

        System.out.println(example);

        System.out.println(!example);

    }
}
