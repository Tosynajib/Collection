package org.example.List;


import java.util.*;

public class SortLinkedList {
    public static void main(String[] args) {
//        ***********************************************************************
//        CREATING A LINKED LIST

        LinkedList<String> Fruits= new LinkedList<>();
        Fruits.add("Pawpaw");
        Fruits.add("Watermelon");
        Fruits.add("Orange");
        Fruits.add("Banana");
        System.out.println("Before sorting" + Fruits);

//        SORTING THE ABOVE LINKEDLINK

        Collections.sort(Fruits);
        System.out.println("After sorting my list" + Fruits);

//        ************************************
//        Iterating ArrayList using for-each loop

//        Adding object arraylist

        LinkedList<String> Fruits2 = new LinkedList<>();
        Fruits2.add("Pawpaw");
        Fruits2.add("Watermelon");
        Fruits2.add("Orange");
        Fruits2.add("Banana");
//        Traversings list for-each loop

        for (String Fruit: Fruits2)
            System.out.println(Fruit);

//        Iterating ArrayList using Iterator data-type method

        LinkedList<String> Fruits3 = new LinkedList<>();
        Fruits2.add("Pawpaw");
        Fruits2.add("Watermelon");
        Fruits2.add("Orange");
        Fruits2.add("Banana");
        Iterator<String> itr = Fruits3.iterator();
        while (itr.hasNext()) {
            System.out.println("" + itr.next());
        }


//        ArrayList example to remove element

        LinkedList<String> country = new LinkedList<>();
        country.add("Nigeria");
        country.add("Senegal");
        country.add("Tunisia");
        country.add("Uganda");

        System.out.println(country);
        country.remove( 1);
        System.out.println(country);

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Brazil");
        countries.add("Togo");
//        Adding Uganda so i can get similarities btw country&countries
        countries.add("Uganda");

//        country.addAll(countries);
//        System.out.println("Adding list of country with: " + countries);
//       *****************************************
        country.retainAll(countries);
        System.out.println(country);

//        *******************************************************************

    }
}
