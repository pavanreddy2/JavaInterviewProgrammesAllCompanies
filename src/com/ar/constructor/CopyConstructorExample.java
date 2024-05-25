package com.ar.constructor;


class Employee {
    private int id;
    private String name;
    private double salary;

    //parameterized Constructor
    public Employee (int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Copy Constructor
    public Employee (Employee employee){
         this.id = employee.id;
         this.name = employee.name;
         this.salary = employee.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class CopyConstructorExample {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"jagadeesh", 70000d);

        System.out.println(employee);

        System.out.println();

        Employee employee2 = new Employee(employee);
        System.out.println(employee2);
    }
}
