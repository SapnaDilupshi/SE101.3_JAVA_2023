package com.mycompany.shapeobj;
public class Rectangle implements Shape
{
    private double length;
    private double width;
    // Parameterized constructor
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    //setter method to length
    public void setLength(double length)
    {
        this.length=length;
    }
    //getter method to length
    public double getLength()
    {
        return length;
    }
    //setter method to width
    public void setWidth(double width)
    {
        this.width=width;
    }
    //getter mrthod to width
    public double getWidth()
    {
        return width;
    }
    //calculating area of the rectangle
    @Override
    public double calculateArea()
    {
        return length*width;
    }
    //calculating perimeter of the rectancle
    @Override
    public double calculatePerimeter()
    {
        return 2*(length+width);
    }
}


