package com.ar.MyInterview;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachChar {
    public static void main(String[] args) {
        String str = "welcome";
        Map<Character, Long> occurance = str.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        occurance.forEach((character, count) ->
                      System.out.println("character : " + character + " count :"+ count));
    }
}
