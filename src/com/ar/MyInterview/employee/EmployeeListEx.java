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

        //Fetch Second Highest Salary
        Employee secondHighestSalary = asList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestSalary);
        //Fetching Second Highest Salary where Key as Employee Object & Value as Name
        Optional<Employee> secondHighest = asList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        Map<Employee,String> employeeStringMap1 = secondHighest.
                map(employee -> Map.of(employee,employee.getName()))
                .orElse(Map.of());
        System.out.println(employeeStringMap1);
        //Fetching Second Highest Salary where Key as Employee Name & Value as Employee Object
        Map<String,Employee> employeeStringMap2 = secondHighest
                .map(employee -> Map.of(employee.getName(),employee))
                .orElse(Map.of());
        System.out.println(employeeStringMap2);

        //sort the Employee based on the name
        List<Employee> sortBasedOnName = asList.stream().sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getId)).collect(Collectors.toList());
        System.out.println(sortBasedOnName);
       //thenComparing --> Suppose if there is same Name , we can use thenCOmparing()


        //Double  the salary & return the Salary
        List<Integer> collect = asList.stream().map(employee -> employee.getSalary() * 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
