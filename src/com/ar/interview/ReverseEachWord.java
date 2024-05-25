package com.ar.interview;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "my name is pavan";
        String reversedWord = reverse(str);

      String[] arr =  str.split(" ");
        System.out.println(arr);
        String reversedEachWord = "";
        for (int i = 0; i < arr.length; i ++){
            reversedEachWord = reversedEachWord + reverse(arr[i] + " ");
        }

        System.out.println(reversedEachWord.trim());
    }

    public static String reverse(String input){

        String rev = "";
        for (int i = input.length()- 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }

}
