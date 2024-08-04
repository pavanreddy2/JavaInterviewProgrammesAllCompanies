package com.ar.HCL;

public class Example8 {
    public static void main(String[] args) {
        try {
            args = null;
            args[0] = "welcome";
            System.out.println(args[0]);
        } catch (Exception e) {
            System.out.println("Exception");
  /*      }catch (NullPointerException e){
            System.out.println("null");
        }*/
        }
    }
}
