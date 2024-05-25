package com.ar.general;

public class AutoAndUnBoxing {
    public static void main(String[] args) {

        int i = 100;

        Integer in = i; // autoboxing.
        System.out.println(i);
        System.out.println(in);
        //Unboxing
        Integer in1 = Integer.valueOf(100);
          int i2 = in1;
        System.out.println(in1);
        System.out.println(i2);
    }
}
