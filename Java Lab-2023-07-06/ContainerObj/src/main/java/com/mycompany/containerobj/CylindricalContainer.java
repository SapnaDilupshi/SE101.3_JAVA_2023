package com.mycompany.containerobj;

public class CylindricalContainer extends Container
{
    private double height,radius ;
    public CylindricalContainer (double height,double radius)
    {
        this.height=height;
        this.radius =radius;
    }
    public double volume()
    {
        return 3.14159f * radius *radius*height;
    }
}
