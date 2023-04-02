package com.openbootcamp;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("2435365", "Perez");
        personas.put("1346136", "Rodriguez");
        personas.put("3466436", "Martinez");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String values : personas.values()) {
            System.out.println(values);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
