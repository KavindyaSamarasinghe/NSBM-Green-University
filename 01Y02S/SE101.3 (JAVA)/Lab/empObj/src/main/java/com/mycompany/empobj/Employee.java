package com.mycompany.empobj;
public class Employee 
{
    //data
    private int empNo;
    private String empName;
    private float basicSalary;
    
    //method
    public void setValues(int no, String en,float bs)
    {
        empNo=no;
        empName=en;
        basicSalary=bs;
    }
    public void displayDetails()
    {
        System.out.println("Employee Number "+empNo);
        System.out.println("Employee Name "+empName);
        System.out.println("Basic Salary "+basicSalary);
    }
    public void setBasicsalary(float basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    public float getbs()
    {
        return basicSalary;
    }
}
