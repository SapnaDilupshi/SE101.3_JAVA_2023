package com.mycompany.bankaccountobj;
public abstract class BankAccount
{
    //Data
    private String accountNumber;
    private double balance;
    
    //setter method to AccountNumber
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    //getter method to AccountNumber
    public String getAccountNumber()
    {
        return accountNumber;
    }
    //setter method to Balance
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    //getter method to Balance
    public double getBalance()
    {
        return balance;
    }
    
    //Creating an Abstract Method to call calculateInterest
    public abstract void calculateInterest(); 
}
