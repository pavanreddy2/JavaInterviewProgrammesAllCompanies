package com.ar.MyInterview;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,23,11,34,221);

        //Using Java8
      List<Integer> duplicateRemove = list.stream().distinct().collect(Collectors.toList());
      System.out.println(duplicateRemove);

      //Using Java7
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        //Remove Duplicates from Array.
        int[] arr = {1,2,3,55,2,12,55,11};
       List<Integer> list1 = Arrays.stream(arr)
                .boxed()
                .distinct().collect(Collectors.toList());
       System.out.println(list1);

       //using Java7
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int in: arr){
            set1.add(in);
        }
        //Convert Set back to Array
        int[] result = new int[set1.size()];
        int i = 0;
        for (Integer num: set1){
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));

       //Remove duplicate Characters in String
        String str = "pavan";
        String duplicatremove = str.chars()//convert the String into IntStream of ASCII values of the characters in the String.
                .mapToObj(c -> (char)c)//maps each ASCII value in the IntStream to its corresponding Character Object.
                .distinct()
                .map(String::valueOf)//String::valueOf means c -> String.valueOf(c)
                                     //maps each Character Object in the stream to its corresponding String representation.
                .collect(Collectors.joining()); //Collects all the elements of the Stream<String> into a single String.
        // Collectors.joining()-->collect concatenates all the Strings in the Stream into one String.
        System.out.println(duplicatremove);

        //
    }
}
