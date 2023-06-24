package com.mycompany.bankaccountobj;
public class BankAccountObj
{

    public static void main(String[] args) 
    {
        //Savings
        SavingAccount savingAccount = new SavingAccount ();
        savingAccount.setBalance(20000000);
        savingAccount.calculateInterest();
        
        //Checkings
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(1000000);
        checkingAccount.calculateInterest();
    }
}
