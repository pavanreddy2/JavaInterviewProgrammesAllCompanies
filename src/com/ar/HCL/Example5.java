package com.ar.HCL;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

interface  Myinterface {
    void show ();
}
class MyClass1 implements Myinterface{

    @Override
    public void show() {

    }

    public void show1 () {

    }
}

class MyClass2 extends MyClass1{
    public void show () {

    }
}
public class Example5 {
    public static void main(String[] args) {

        List<Myinterface> list = new ArrayList<>();
        list.add(new MyClass1());
        list.add(new MyClass2());

        for (Myinterface intf: list){
            intf.show();
            //intf.show1();
        }
    }
}
