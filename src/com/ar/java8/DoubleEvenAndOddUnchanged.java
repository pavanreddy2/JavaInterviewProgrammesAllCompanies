package com.ar.java8;

import java.util.Arrays;


public class DoubleEvenAndOddUnchanged {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,61,3,9,8};

        Arrays.stream(arr)
                .map(i -> i % 2 == 0 ? i * 2 : i)
                .forEach(System.out::println);
    }
}
