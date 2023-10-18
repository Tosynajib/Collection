package org.example.List;

import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {

//        HASHSET WILL ONLY PRINT OUT ONE WORD IF YOU HAVE MORE THAN ONE SIMILAR
//        PRINT OUT ON SAME LINES
        HashSet<String> newHash = new HashSet<>();
        newHash.add("Students");
        newHash.add("Principal");
        newHash.add("Teachers");
        newHash.add("Vice-Principal");
        newHash.add(null);
        newHash.add("Students");
        newHash.add(null);
        System.out.println(newHash);

//        ADVANCE FOR() LOOP
//        TO PRINT OUT ON DIFFERENT LINES
//
        for(String firstHash: newHash) {
            System.out.println("Advance for() loop" +  firstHash);
        }

//        USING FOREACH LOOP() METHOD
//        ( -> ) THIS IS A LAMBDA EXPRESSION
        newHash.forEach(item -> System.out.println(newHash));

    }
}
