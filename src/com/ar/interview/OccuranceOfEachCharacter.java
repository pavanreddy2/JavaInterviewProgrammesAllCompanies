package com.ar.interview;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        String str = "jagadeesha";
        char[] chars =  str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (Character ch: chars){
            if (map.containsKey(ch)){
                Integer in = map.get(ch);
                map.put(ch, in + 1);
            } else {
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
