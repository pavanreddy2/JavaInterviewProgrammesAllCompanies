package com.ar.MyInterview.exception;

public class Example2 {
    public static boolean isException() {
        try {
            System.out.println("in try block");
            throw new Exception("testing");
        } catch (Exception e) {
            System.out.println("in catch block");
            return true;
        } finally {
            System.out.println("in finally block");
        }
    }

    public static void main(String[] args) {
        boolean exception = isException();
        System.out.println(exception);
    }
}
//in try block
//in catch block
//in finally block
//true