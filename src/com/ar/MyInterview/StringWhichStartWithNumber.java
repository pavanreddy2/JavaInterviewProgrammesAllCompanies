package com.ar.MyInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWhichStartWithNumber {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("123Ass", "123APJ", "oiooo22", "poink11`", "122o");
        List<String> result = list.stream()
                .filter(s -> s.matches("^[0-9].*"))
                .collect(Collectors.toList());
        System.out.println(result);

        //Need which End with Number
        List<String> result1 = list.stream().filter(s -> s.matches(".*[0-9]$"))
                .collect(Collectors.toList());
        System.out.println(result1);
        //^ ==> Matches the start of a string.
        //$ ==> Matches the end of a String
        //.*: This part of the pattern matches any character (except line terminators) 0 or more times after the digit.
    }
}
