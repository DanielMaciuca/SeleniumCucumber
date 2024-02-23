package JavaCourse.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String[] args) {

        // The main difference between an Array and an ArrayList is that ArrayList is flexible, you can remove/add elements how many elements you want, in Arrays this is not possible, you have a fix number of elements
        // ArrayList only work with objects: String, Integer, etc.
        // You can use ArrayList to print all the elements with a specific tag from the page
        // List<String> fruitList vs ArrayList<String> fruitList -> the first is an interface and it is recommended to use, because it has a higher level of abstraction
        // Array List is ordered by is not sorted, it is ordered because it always takes into consideration the index
        // Sorted means that elements not taken by index, are taken by: A,B,C,D, alphabetical?

        List<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Mango");

        // You can add an element in the list using a specific index, the other elements will be shifted
        fruitList.add(1, "Pere");

        System.out.println(fruitList);

        System.out.println(fruitList.size());

        // fruitList.remove("Banana");
        // fruitList.clear();

        System.out.println(fruitList.contains("Apple123"));

        //get the value by index
        System.out.println(fruitList.get(2));

        // index 2
        System.out.println(fruitList.indexOf("Orange"));

        // how to display all the indexes and all the elements

        for (String e : fruitList) {

            System.out.println(fruitList.indexOf(e) + " " + e);
        }

    }
}
