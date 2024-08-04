package com.ar.MyInterview.employee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class EmployeeListEx {
    public static void main(String[] args) {
     List<Employee> asList = Arrays.asList(new Employee(1,"pavan",29,100000),
                     new Employee(2,"anurudh",25,150000),
                     new Employee(3,"nikhil",28,75000),
                     new Employee(4,"sunitha",30,95000),
                     new Employee(22,"sunitha",20,85000));
     Map<Employee,String> employeeStringMap =  asList.stream()
                .collect(Collectors.groupingBy(Employee::getName))
                .values()
                .stream()
                .filter(list -> list.size() > 1)//Filter groups with more than one employee
                .flatMap(Collection::stream)//Flattern the stream
                .collect(Collectors.toMap(c -> c, Employee::getName));
     System.out.println(employeeStringMap);
     //Now Key as Name, Value is Employee Object
        Map<String,List<Employee>> employeeList =  asList.stream()
                .collect(Collectors.groupingBy(Employee::getName))
                .entrySet()
                .stream()
                
                .filter(list -> list.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(employeeList);
    }
}
