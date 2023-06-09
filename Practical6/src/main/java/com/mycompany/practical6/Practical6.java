/*
    Exercise 01.
01) There is no difference between these approaches.
Because the interface automatically applies public, static, final keywords to the variable declaration.  

02) There is no difference between these approaches. When the methods declared within an interface are implicitly include the “abstract” keyword.
All methods within an interface are considered abstract keyword by default.

03)No, x is not possible to change. Because override method is not support in interface.
When we try to change “x” value then result will give in a compilation error.

*/


package com.mycompany.practical6;
public class Practical6 
{

    public static void main(String[] args)
    {
        InterfaceImplemented inface = new InterfaceImplemented();
        inface.display();
    }
}
