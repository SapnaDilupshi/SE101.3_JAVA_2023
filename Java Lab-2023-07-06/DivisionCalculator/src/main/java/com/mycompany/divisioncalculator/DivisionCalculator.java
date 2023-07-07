package com.mycompany.divisioncalculator;
import java.util.Scanner;
public class DivisionCalculator 
{
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Enter the dividend: ");
         int dividend = scanner.nextInt();
         
         System.out.print("Enter the divisor: ");
         int divisor = scanner.nextInt();
         
         try
         {
             int quotient = divide (dividend,divisor);
             System.out.print("Quotient: " + quotient);
         }
         catch(ArithmeticException e)
         {
             System.out.print("Error: "+e.getMessage());
         }
         scanner.close();
    }     
        public static int divide (int dividend,int divisor)
        {
             if (divisor == 0)
             {
                 throw new ArithmeticException("Division by zero is not allowed.");
             }
             return dividend/divisor;
         }
}




/*
    01) What is the purpose of the try - catch block in the main method? 
            Java's Try Catch statements let you specify a block of code that will be checked for exceptions (errors) while it runs.
        In Java, the try and catch statements are always used in pairs. 
        The catch statement enables you to provide a block of code that will be run if an error is encountered in the try block.
        The try block's remaining statements won't run if an exception arises at that specific statement. 

    02) What type of exception is caught by the catch block?
            Each catch block is an exception handler that handles the type of exception indicated by its argument.
        The argument type, ExceptionType , declares the type of exception that the handler can handle and must be
        the name of a class that inherits from the Throwable class.
        The handler can refer to the exception with name .
            
    03) What message will be displayed if a division by zero occurs?
                Exception in thread "main" java.lang.ArithmeticException: /by zero
            at YourClassName.yourMethodName(YpurClassName.java:lineNumber)
  

*/
