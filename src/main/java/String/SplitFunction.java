package String;

public class SplitFunction {

    public static void main(String[] args) {

        //Split function
        String myString = "123-456";

        String[] parts = myString.split("-");

        System.out.println(parts[0]);

        System.out.println(parts[1]);

        String myString2 = "Ala bala portocala";

        String[] space = myString2.split(" ");

        System.out.println(space[0]);

        System.out.println(space[1]);

        System.out.println(space[2]);

    }

}

