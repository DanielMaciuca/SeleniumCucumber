package StringFunctions;

public class StringSubString {


    public static void main(String[] args) {

        String[] date = {"17.01.1985-100", "21.02.1956-200"};

        System.out.println(date[0]);

        String formattedDate = date[0].substring(0,2);

        System.out.println(formattedDate);

    }

}
