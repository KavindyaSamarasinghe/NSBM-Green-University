package com.mycompany.p3q2;
public class P3Q2 
{

    public static void main(String[] args)
    {
      Employee e1 = new Employee("Bogdan", 50000.f, 5000.f);

        String name = e1.getName();
        float salary = e1.getSalary();
        float bonus = e1.getBonus();
        float bonusAmount = e1.calculateBonusAmount();

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}
