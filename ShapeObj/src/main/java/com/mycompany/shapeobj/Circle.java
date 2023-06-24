package com.mycompany.shapeobj;
public class Circle implements Shape
{
    //Data
    private double radius;
    //parameterized constructor
    public Circle (double radius)
    {
        this.radius=radius;
    }
    //setter method to radius
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    //getter method to radius
    public double getRadius()
    {
        return radius;
    }
    //calculate area of the rectangle
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    //calculate perimeter of the circle
    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}

