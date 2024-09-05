package com.ar.MyInterview;

import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i<=num; i++){
            factorial  = factorial * i; //1 , 2, 6 , 24, 120
        }
        System.out.println("Factorial of " + num + " is " + factorial);

        //In Java8
        int factorial1 = IntStream.rangeClosed(1, num)
                .reduce(1,(a,b) -> a * b);
        System.out.println(factorial1);
        //IntStream is a class in Java that represents a stream of primitive int values.
        //rangeClosed is a method that creates an IntStream that contains a range of numbers from the first argument (1)
        // to the second argument (num), inclusive.
        //reduce is a method that applies a binary operation to each element of the stream, reducing it to a single output value.
        //binary means that takes two inputs and produces one output.
    }
}
