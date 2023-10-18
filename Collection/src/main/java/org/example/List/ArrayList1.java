package org.example.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> Fruits= new ArrayList<>();
        Fruits.add("Pawpaw");
        Fruits.add("Watermelon");
        Fruits.add("Orange");
        Fruits.add("Banana");
        System.out.println(Fruits);

//        ************************************
//        Iterating ArrayList using for-each loop

//        Adding object arraylist

        ArrayList<String> Fruits2 = new ArrayList<String>();
        Fruits2.add("Pawpaw");
        Fruits2.add("Watermelon");
        Fruits2.add("Orange");
        Fruits2.add("Banana");
//        Traversings list for-each loop
        for (String Fruit: Fruits2)
            System.out.println(Fruit);

//        Iterating ArrayList using Iterator data-type method

        ArrayList<String> Fruits3 = new ArrayList<String>();
        Fruits2.add("Pawpaw");
        Fruits2.add("Watermelon");
        Fruits2.add("Orange");
        Fruits2.add("Banana");
        Iterator<String> itr = Fruits3.iterator();
        while (itr.hasNext()) {
            System.out.println("" + itr.next());
        }


//        ArrayList example to remove element

        ArrayList<String> country = new ArrayList<String>();
        country.add("Nigeria");
        country.add("Senegal");
        country.add("Tunisia");
        country.add("Uganda");

        System.out.println(country);
        country.remove( 1);
        System.out.println(country);

        ArrayList<String> countries = new ArrayList<>();
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
