package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,52,12,44,244,222,244);

        Optional<Integer> secondHighest  = list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1).findFirst();

        if (secondHighest.isPresent()){
            System.out.println(secondHighest);
        }else {
            System.out.println("No number found");
        }

    }
}
