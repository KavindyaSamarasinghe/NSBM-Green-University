package com.mycompany.p4q1;
public class P4Q1
{

    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
       e1.setEmpID(1);
        e1.setEmpName("Mr. Bogdan");
        e1.setDesignation("Manager");

        Employee e2 = new Employee();
        e2.setEmpID(2);
        e2.setEmpName("Ms. Bird");
        e2.setDesignation("Engineer");

        System.out.println("Employee 1:");
        System.out.println("ID: " + e1.getEmpID());
        System.out.println("Name: " + e1.getEmpName());
        System.out.println("Designation: " + e1.getDesignation());
        
        System.out.println("Employee 2:");
        System.out.println("ID: " + e2.getEmpID());
        System.out.println("Name: " + e2.getEmpName());
        System.out.println("Designation: " + e2.getDesignation());
    }
}
