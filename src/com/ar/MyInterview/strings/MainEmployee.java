package com.ar.MyInterview.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainEmployee {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        Employee employee1 = new Employee(1, "pavan");
        Employee employee2 = new Employee(1, "pavan");
        set.add(employee1);
        set.add(employee2);
        System.out.println(set.size()); //1
        System.out.println(employee1.equals(employee2));// false
        System.out.println(employee1==employee2); //false
    }
}