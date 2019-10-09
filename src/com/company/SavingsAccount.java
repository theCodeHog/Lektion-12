package com.company;

public class SavingsAccount extends Account {

    //FIELDS
    private double interestRate;

    //CONSTRUCTOR
    SavingsAccount(double interestRate){
        super(0);
        this.interestRate = interestRate;
    }

    //METHODS
    @Override
    public void showInfo() {
        System.out.println("I’m a Savings account and my balance is: "+getBalance()+" " +
                "and the interest rate is: "+interestRate);
    }
}
