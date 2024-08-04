package com.ar.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,25,15,19,15,98,49);
        Integer max = Collections.max(myList);
        List<Integer> collect = myList.stream()
                .filter(x -> x == max)
                .collect(Collectors.toList());
        System.out.println(collect);

    }

}
