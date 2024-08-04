package com.ar.interview;

/**
 *
 */

class Singleton {
    private static Singleton single_instance = null;

    private Singleton() {}

    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton_ref = Singleton.getInstance();

        Singleton singleton_ref1 = Singleton.getInstance();

        System.out.println(singleton_ref.hashCode());
        System.out.println(singleton_ref1.hashCode());
    }
}
