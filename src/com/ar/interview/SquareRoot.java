package com.ar.interview;

public class SquareRoot {
    public static void main(String[] args) {

        double number = 15.0;
        double epsilon = 1e-15;

        double low = 0.0;
        double high = number;
        double guess = (low + high) / 2.0;

        while (Math.abs(guess * guess - number) > epsilon){
            if (guess * guess < number){
                low = guess;
            } else {
                high = guess;
            }
            guess = (low + high) / 2.0;
        }

        System.out.println("The Square Root of the number :"+ guess);
    }
}
