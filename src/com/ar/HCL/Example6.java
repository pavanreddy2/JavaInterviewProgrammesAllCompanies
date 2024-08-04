package com.ar.HCL;

import java.util.stream.Stream;

public class Example6 {
    public static void main(String[] args) {
        Stream.iterate(2,(Integer data) -> data * data)
                .limit(5)
                .forEach(System.out::println);
    }
}
