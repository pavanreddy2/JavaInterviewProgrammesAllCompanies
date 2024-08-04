package com.ar.HCL;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 7);
       long l2 =  list.stream().distinct().count();
       System.out.println(l2);
    }
}
