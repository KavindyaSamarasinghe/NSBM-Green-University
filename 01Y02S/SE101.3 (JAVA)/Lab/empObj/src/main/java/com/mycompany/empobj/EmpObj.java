package com.mycompany.empobj;
public class EmpObj 
{

    public static void main(String[] args)
    {
       Employee e1=new Employee();
       e1.setValues(12,"abc",40000.00f);
       e1.displayDetails();
       e1.setBasicsalary(30000.00f);
       System.out.println("Basic Salary "+e1.getbs());
    }
}
