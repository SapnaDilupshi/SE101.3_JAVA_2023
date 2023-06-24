package com.mycompany.bankaccountobj;
public class CheckingAccount extends BankAccount
{
    public static final double CHECKING_INTEREST_RATE=0.02;
    @Override
    public void calculateInterest()
    {
        double interest = getBalance()*CHECKING_INTEREST_RATE;
        System.out.println("The interest for the checking account is: Rs."+interest);
    }
}
