package com.mycompany.practical5_4obj;
public class Practical5_4Obj 
{

    public static void main(String[] args) 
    {
        Circle circle=new Circle(7.0);
        double circleArea = circle.calculateArea();
        circle.display();
        System.out.println("Area of the circle: "+circle.calculateArea());
        
        Rectangle rectangle=new Rectangle(10.0, 5.0);
        double rectangleArea = rectangle.calculateArea();
        rectangle.display();
        System.out.println("Area of the rectangle: "+rectangle.calculateArea());
        
    }
}
