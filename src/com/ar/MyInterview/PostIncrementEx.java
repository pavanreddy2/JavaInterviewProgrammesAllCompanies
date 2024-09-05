package com.ar.MyInterview;

public class PostIncrementEx {
    public static void main(String[] args) {
        int x = 8;
        ++x;//Preincrement//First increment by 1 and assign to x //9
        x++;//post increment //This means x is used first, and then it is incremented.
        System.out.println(x++);//10
    }
}
