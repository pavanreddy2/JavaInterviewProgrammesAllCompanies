package com.ar.MyInterview;


import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    private static final Set<Character> VOWELS = Set.of('a','e','i','o','u','A','E','I','O','U');

    public static void main(String[] args) {
        //Filter Non-repeated VOWEL.
        String str2 = "p@a!v#a$n";
        Character character = str2.replaceAll("[^a-zA-Z0-9]","")
                .chars()
                .mapToObj(c -> (char)c)
                .filter(VOWELS::contains)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(character);

        String str = "pavan";
       Character firstRepeatedChar = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                        .filter(c1 -> c1.getValue() == 1)
                                .map(Map.Entry::getKey)
                                        .findFirst()
                                                .orElse(null);
       System.out.println(firstRepeatedChar);

       //Special Characters in String. remove that find 1st Non-repeated character
        String str1 = "p@a!v#a$n";
       Character removeSpecialFirstNon = str1.replaceAll("[^a-zA-Z0-9]","")
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(c1 -> c1.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
       System.out.println(removeSpecialFirstNon);
    }
}
