package com.ar.MyInterview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaces {
    public static void main(String[] args) {
        //Function
        String str = "hello world";
        Function<String, Integer> lengthOfString = s -> s.length();
        int in = lengthOfString.apply(str);
        System.out.println(in);
        //Predicate
        Predicate<Integer> pred = num -> num > 0;
        System.out.println(pred.test(2));
        System.out.println(pred.test(-1));
        //Supplier
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
        //Consumer
        List<String> list = Arrays.asList("1","23","34","90");
        list.forEach(System.out::println);
        //another example
        Consumer<String> messageConsumer = message -> System.out.println("Message: " + message);
        // Accept a message and print it
        messageConsumer.accept("Hello, World!");
    }
}
