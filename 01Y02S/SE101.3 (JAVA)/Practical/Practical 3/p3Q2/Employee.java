package com.mycompany.p3q2;
public class Employee 
{
    private String name;
    private float salary;
    private float bonus;
    
    public Employee(String name,float salary,float bonus)
    {
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
    }
    public String getName()
    {
        return name;
    }
           
    public void setName(String name)
    {
        this.name=name;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    public float getBonus()
    {
        return bonus;
    }
    public void setBonus(float bonus)
    {
        this.bonus=bonus;
    }
    public float calculateBonusAmount()
    {
        return salary + bonus;
    }
}