package StringFunctions;

public class StringFunctions {


    public static void main(String[] args) {

        //Substring function

        String[] date = {"17.01.1985-100", "21.02.1956-200"};

        System.out.println(date[0]);

        String formattedDate = date[0].substring(0,2);

        System.out.println(formattedDate);

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
