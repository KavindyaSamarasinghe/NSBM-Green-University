package com.mycompany.p3qq1;
public class P3Qq1 
{

    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setName("ABC");
        emp.setAge(22);
        emp.setSalary(40000.0f);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
