package com.ar.HCL;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        double d = Stream.of("lion","tigers","bears").collect(Collectors.averagingInt(String::length));

        System.out.println(d);

    }
}
