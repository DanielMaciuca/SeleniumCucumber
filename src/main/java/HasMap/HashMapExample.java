package HasMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        HashMap<String, Integer> happy = new HashMap<>();

        happy.put("a", 10);
        happy.put("b", 20);
        happy.put("c", 30);
        happy.put("d", 40);

        System.out.println(happy.get("b"));

        System.out.println(happy);

        HashMap<String, String> fun = new HashMap<>();

        fun.put("Boby99", "fluffy!");
        fun.put("Gigi", "porto");
		fun.put("Nicu", "mona100");
		fun.put("Mihai", "mona100");
        fun.remove("Gigi");

        System.out.println(fun);

        System.out.println(fun.replace("Mihai", "monaUpdated"));

		System.out.println(fun);

    }
}