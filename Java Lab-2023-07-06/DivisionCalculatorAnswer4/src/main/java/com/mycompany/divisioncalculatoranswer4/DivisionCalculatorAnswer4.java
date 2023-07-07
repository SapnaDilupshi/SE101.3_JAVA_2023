
//  04) Modify the code to handle any input mismatch exceptions when reading the dividend and divisor

package com.mycompany.divisioncalculatoranswer4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionCalculatorAnswer4
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        
        int dividend = 0;
        int divisor = 0;
        
        try
        {
            System.out.println("Enter the dividend: ");
            dividend = scanner.nextInt();
            
            System.out.println("Enter the divisor: ");
            divisor = scanner.nextInt();
            
            int quotient = divide(dividend,divisor);
            System.out.println("Quotient: "+quotient);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: Invalid input.Please enter valid integers");
        }
        finally
        {
            scanner.close();
        }
    }
    public static int divide(int dividend,int divisor)
    {
        if(divisor == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend/divisor;
    }
}
