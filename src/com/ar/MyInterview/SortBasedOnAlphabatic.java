package com.ar.MyInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortBasedOnAlphabatic {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pavan", "Abc", "anurudh","buggana");
        List<String> sortedList = list.stream().
                map(String::toLowerCase)
                .sorted().collect(Collectors.toList());
       System.out.println(sortedList);
    }

}
