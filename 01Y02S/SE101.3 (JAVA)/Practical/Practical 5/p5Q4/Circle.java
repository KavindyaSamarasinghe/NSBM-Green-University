package com.mycompany.p5q4;
public class Circle extends Shape
{
    private final float radius;

    public Circle(double radius)
    {
        this.radius = (float) radius;
    }

    @Override
    public float calculateArea() 
    {
        return (float) (Math.PI * radius * radius);
    }
}
