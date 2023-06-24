package com.mycompany.bankaccountobj;
public class SavingAccount extends BankAccount
{
    private static final double SAVING_INTEREST_RATE=0.12;
    
   @Override
   public void calculateInterest ()
   {
       double interest = getBalance()*SAVING_INTEREST_RATE;
       System.out.println("The interest for the savings account is: Rs."+interest);
   }
}
