package com.mycompany.p5q4;
public class Rectangle extends Shape
{
    private float length;
    private float width;

    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea() 
    {
        return length * width;
    }
}
