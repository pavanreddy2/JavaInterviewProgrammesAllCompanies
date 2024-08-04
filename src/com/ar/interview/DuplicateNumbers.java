package com.ar.interview;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,3,5,6,67,2,3);

      Map<Integer,Long> duplicate =   list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(c -> c.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

      System.out.println(duplicate.keySet());
    }
}
