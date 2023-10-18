package org.example.List;

import java.util.HashMap;

public class NewHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Lagos", 400);
        map.put("Kwara", 300);
        map.put("Osun", 200);
        map.put("Benin", 100);

        System.out.println(map);

//        ACCESS THE VALUE CORRESPONDING TO THE KEY

        Integer LagosValue = map.get("Lagos");
        System.out.println(LagosValue);

//        REMOVING A HASHMAP KWARA AND ADDING SIZE OF THE STRING

        map.remove("Kwara");
        int size = map.size();
        System.out.println(map);
        System.out.println(size);

//        MAP CONTAINS KEY (BOOLEAN) PRINTS TRUE/FALSE

        boolean exist = map.containsKey("Lagos");
        System.out.println(exist);

    }
}
