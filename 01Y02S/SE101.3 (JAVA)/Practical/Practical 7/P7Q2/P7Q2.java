package com.mycompany.p7q2;
public class P7Q2
{

    public static void main(String[] args) 
    {
        int[] numbers={1,2,3,4,5};
        try
        {
            int value=numbers[7];
            System.out.println("Value: "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}

//output: - Array index is out of bounds