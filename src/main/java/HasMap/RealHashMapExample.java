package HasMap;

import java.util.HashMap;

public class RealHashMapExample {

    public static String STATUS;

    public static String DATE = "date2";

    public static void main(String[] args) {

        myMethod("Connection1");

    }

    public static void myMethod(String connection) {

        HashMap<String, String> happy = new HashMap<>();

        happy.put("connection", connection);
        happy.put(STATUS, "Enable Connection");

        System.out.println(happy.get("connection"));
        System.out.println(happy.get(STATUS));
        System.out.println(happy.get(DATE));

    }
}


