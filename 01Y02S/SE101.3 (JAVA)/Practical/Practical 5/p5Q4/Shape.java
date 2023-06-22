package com.mycompany.p5q4;
abstract class Shape 
{
    public abstract float calculateArea();

    public void display() 
    {
        System.out.println("Area: " + calculateArea());
    }
             
}
