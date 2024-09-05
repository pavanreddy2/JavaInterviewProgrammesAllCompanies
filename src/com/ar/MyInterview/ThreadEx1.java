package com.ar.MyInterview;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx1 {
    public static void main(String[] args) {
/*        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
        });
        thread.start();
        thread.start();//This will throw IllegalThreadStateException*/

/*
        int x = 2;
        int y = ++x * 3 + x--;
        System.out.println(y);*/

/*        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String element: list){
            list.remove(element);
        }
        System.out.println(list.size());*/

        String str1 = "Open";
        String str2 = "AI";

        String str3 = str1 + str2;
        String str4 = "OpenAI";
        System.out.println(str3 == str4);
    }
}
