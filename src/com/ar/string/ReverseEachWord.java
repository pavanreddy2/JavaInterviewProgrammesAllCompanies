package com.ar.string;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Hello, This is java class";

         String[] str1=  str.split("\\s");

         for (String strs: str1){
             String reverse = "";
            for (int i = strs.length() - 1; i>=0; i--){
                    reverse = reverse + strs.charAt(i);
            }

            System.out.print(reverse+ " ");
         }
    }
}
