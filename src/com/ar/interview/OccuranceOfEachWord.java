package com.ar.interview;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        String str = "I am going to college and I am going to trim";
        String[] words =  str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for (String word: words){
            if (map.containsKey(word)){
               Integer in =  map.get(word);
               map.put(word,in + 1);
            } else {
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
