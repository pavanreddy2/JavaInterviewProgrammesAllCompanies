package com.ar.MyInterview;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoubtsMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,2,12,55,11};
       IntStream intStream =  Arrays.stream(arr);
       System.out.println(intStream);
      Stream<Integer> in = intStream.boxed();
        in.forEach(System.out::println);

    }
}
