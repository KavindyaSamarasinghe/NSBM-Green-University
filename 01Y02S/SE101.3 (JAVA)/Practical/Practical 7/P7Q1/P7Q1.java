package com.mycompany.p7q1;
import java.util.Scanner;
public class P7Q1 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the numerator: ");
        int numerator=sc.nextInt();
        
        System.out.println("Enter the denominator: ");
        int denominator=sc.nextInt();
        
        try
        {
            int result=numerator/denominator;
            System.out.println("Result: "+result);
                    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:Division by zero is an error");
        }
        
        
                
    }
}
