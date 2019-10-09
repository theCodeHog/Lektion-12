package com.company;

public class InvestmentAccount extends Account {



    //CONSTRUCTOR
    public InvestmentAccount(){
        super(0);
    }

    //METHODS
    @Override
    public void showInfo() {
        System.out.println("I’m an Investment account and my balance is: "+getBalance());
    }
}
