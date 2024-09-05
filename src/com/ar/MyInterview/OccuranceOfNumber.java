package com.ar.MyInterview;

import java.util.*;
import java.util.stream.Collectors;

public class OccuranceOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,331,22,44,55,1,44,331);
        Map<Integer, Long> occurance = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(occurance);
        //Sorted Order
       Map<Integer,Long> sortedOccurance = occurance.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldKey,newKey) -> oldKey, LinkedHashMap::new
                ));
       System.out.println(sortedOccurance);
       //Java7
        Map<Integer,Long> sorted = new TreeMap<>(occurance);
        System.out.println(sorted);

    }
}
