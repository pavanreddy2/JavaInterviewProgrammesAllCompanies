package com.ar.MyInterview.exception;

public class Example1 {
    public static boolean isException() {
        try {
            System.out.println("in try block");
            throw new ArithmeticException("testing");
        } catch (NullPointerException e) {
            System.out.println("in catch block 1");
        } catch (Exception e) {
            System.out.println("in catch block 2");
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e1) {
                System.out.println("in catch block 3");
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean exception = isException();
        System.out.println(exception);
    }
}
//in try block
//in catch block 2
//in catch block 3
//false