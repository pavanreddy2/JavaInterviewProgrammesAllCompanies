package com.ar.designPattern;

/**
 * Singleton: is class , whose only one instance can be created at any given JVM.
 *
 */
class Singleton {
    /**
     * Static variable with Singleton reference of Single_instance
     */
    private static  Singleton single_instance = null;

    /**
     *
     *
     */
    private Singleton(){

    }

    /**
     * Static method to static create instance of the Singleton method
     *
     * @return
     */
    public static Singleton getInstance(){
        if (single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }

}
public class SingletonEx {
    public static void main(String[] args) {

       Singleton s1 =  Singleton.getInstance();
       System.out.println(s1.hashCode());

      Singleton s2 =  Singleton.getInstance();
      System.out.println(s2.hashCode());
    }
}


//Loogings, configuration settings,

// how to breake Singleton class.
// How to prevent the singleton class.