package com.ar.general;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};

        // Test cases
        String note1 = "ctay";
        String note2 = "bcanihjsrrrferet";
        String note3 = "tbaykkjlgga";
        String note4 = "bbbbbbkjbaby";
        String note5 = "dad";
        String note6 = "breadmaking";
        String note7 = "dadaa";

        System.out.print(find(words, note1)); // Output: "cat"
        System.out.print(find(words, note2)); // Output: "referee"
        System.out.print(find(words, note3)); // Output: "-"
        System.out.print(find(words, note4)); // Output: "baby"
        System.out.print(find(words, note5)); // Output: "dad"
        System.out.print(find(words, note6)); // Output: "bird"
        System.out.print(find(words, note7)); // Output: "dada"
    }

    public static String find(String[] words, String note) {
        int[] noteCharCounts = getCharCounts(note);

        for (String word : words) {
            int[] wordCharCounts = getCharCounts(word);
            if (containsAllChars(noteCharCounts, wordCharCounts)) {
                return word;
            }
        }

        return "-";
    }

    private static int[] getCharCounts(String str) {
        int[] charCounts = new int[26]; // Array to count each character ('a' to 'z')
        for (char c : str.toCharArray()) {
            charCounts[c - 'a']++; // Increment the count for the character
        }
        return charCounts; // Return the array of counts
    }

    private static boolean containsAllChars(int[] noteCharCounts, int[] wordCharCounts) {
        for (int i = 0; i < 26; i++) {
            if (wordCharCounts[i] > noteCharCounts[i]) {
                return false; // Return false if any character in the word is more than in the note
            }
        }
        return true; // Return true if note contains all characters of the word
    }
}
