package com.ar.java8;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharater {
    public static void main(String[] args) {

        String str = "pavavn";

        Set<Character> set = new HashSet<>();
        Character character =
            // returns a stream of int value, where each 'int' value represents a unique code point in the String
                    str.chars()
                  //This Map each 'int' value to a character object
                    .mapToObj(c -> (char)c)
                    .filter(c -> !set.add(c))
                    .findFirst()
                    .orElse(null);

     if (character != null){
         System.out.println("First Repeated Character :"+ character);
     } else {
         System.out.println("No Repeated Character");
     }

    }
}
