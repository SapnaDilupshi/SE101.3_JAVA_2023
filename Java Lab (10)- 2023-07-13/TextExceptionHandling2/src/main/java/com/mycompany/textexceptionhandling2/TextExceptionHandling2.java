package com.mycompany.textexceptionhandling2;
public class TextExceptionHandling2 
{

    public static void main(String[] args)
    {
        int [] numbers = {1,2,3,4,5};
        try
        {
            int value = numbers[3];
            int result = value /0;
            System.out.println("Value : "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds. ");
        }
        catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        finally
        {
            for(int i = 0; i<numbers.length; i++)
            {
                System.out.println(numbers[i]+" ");
            }
        }
    }
}
