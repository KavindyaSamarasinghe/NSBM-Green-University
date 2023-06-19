package com.mycompany.p1q4;
public class P1Q4
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) 
        {
            if (x == 30)
            {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    }
}



