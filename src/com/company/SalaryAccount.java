package com.company;

public class SalaryAccount extends Account {

    //CONSTRUCTOR
    public SalaryAccount(int balance){
        super(balance);
    }

    //METHODS
    @Override
    public void showInfo() {
        System.out.println("I’m a Salary account and my balance is: " +getBalance());
    }
}
