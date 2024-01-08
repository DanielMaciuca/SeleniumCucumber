package StringFunctions;

public class StringFunctions {


    public static void main(String[] args) {

        // String is a complex data type
        // It is actually a class that can be instantiated

        //Substring function

        String[] date = {"17.01.1985-100", "21.02.1956-200"};

        System.out.println(date[0]);

        String formattedDate = date[0].substring(0, 2);

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

        //IndexOf function

        String index = "This is only a string";
        System.out.println(index.indexOf("s"));

        //Replace function

        String myReplaceString = "Ala bala portocala";
        String resultAfterReplace = myReplaceString.replace("bala", "portocala");
        System.out.println(resultAfterReplace);

    }

}
