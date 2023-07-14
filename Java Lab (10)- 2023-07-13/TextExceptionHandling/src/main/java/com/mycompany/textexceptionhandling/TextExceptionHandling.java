package com.mycompany.textexceptionhandling;
import java.util.Scanner;
public class TextExceptionHandling
{

    public static void main(String[] args)
    {
        int num1,num2,ans;
        Scanner sc = new Scanner (System.in);
        try
        {
            System.out.print("Enter First Number : ");
            num1 = sc.nextInt();
            
            System.out.print("Enter Second Number : ");
            num2 = sc.nextInt();
            
            ans = num1/num2;
            System.out.println("Answer is: "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error ");
        }
    }
}
