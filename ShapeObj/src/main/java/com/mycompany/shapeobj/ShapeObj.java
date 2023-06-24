package com.mycompany.shapeobj;
public class ShapeObj
{
    public static void main(String[] args)
    {
        Circle c1=new Circle(7.0);
        System.out.println("Area of the Circle: "+c1.calculateArea());
        System.out.println("Perimeter of the Circle: "+c1.calculatePerimeter());
        
        Rectangle r1=new Rectangle(10.0, 5.0);
        System.out.println("Area of the Rectangle: "+r1.calculateArea());
        System.out.println("Perimeter of the Rectangle: "+r1.calculatePerimeter());
        
        Triangle t1=new Triangle(3.0,4.0,5.0);
        System.out.println("Area of the Triangle: "+t1.calculateArea());
        System.out.println("Perimeter of the Triangle: "+t1.calculatePerimeter());
    }
    
}
