package com.daniel.homework1;

import java.util.HashMap;
import java.util.Map;

public class MapExemple {

    public static void main(String[] args) {

        Map<String,Integer> phones = new HashMap<>();

        phones.put("Samsung", 129);
        phones.put("Apple", 239);
        phones.put("Nokia", 45);

        System.out.println(phones);

    }
}
