package com.mycompany.shapeobj;
public class Triangle implements Shape
{
    //Data declaration
    //TrSide1 is the side 1 of the triangle
    //TrSide2 is the side 2 of the triangle
    //TrSide3 is the side 3 of the triangle
    private double TrSide1;
    private double TrSide2;
    private double TrSide3;
    //parameterized constructor
    public Triangle(double TrSide1,double TrSide2,double TrSide3)
    {
        this.TrSide1=TrSide1;
        this.TrSide2=TrSide2;
    }
    //set method to Triangle Side 1
    public void setTrSide1(double TrSide1)
    {
        this.TrSide1=TrSide1;
    }
    //getter method to triangle Side 1
    public double getTrSide1()
    {
        return TrSide1;
    }
     //set method to Triangle Side 2
    public void setTrSide2(double TrSide2)
    {
        this.TrSide2=TrSide2;
    }
    //getter method to triangle Side 2
    public double getTrSide2()
    {
        return TrSide2;
    }
     //set method to Triangle Side 3
    public void setTrSide3(double TrSide3)
    {
        this.TrSide3=TrSide3;
    }
    //getter method to triangle Side 3
    public double getTrSide3()
    {
        return TrSide3;
    }
    //calculate area of the Triangle
    @Override
    public double calculateArea()
    {
        //s is the semi-perimeter of the triangle
        //math.sqrt() is the squre root
        double s=(TrSide1+TrSide2+TrSide3)/2;
        return Math.sqrt(s*(s-TrSide1)*(s*TrSide2)*s-(s-TrSide3));
    }
    //calculate perimeter of the Triangle
    @Override
    public double calculatePerimeter()
    {
        return TrSide1+TrSide2+TrSide3;
    }
}
