package com.company;

import java.io.Serializable;

public abstract class Account implements Serializable {

    //FIELDS
    private int balance;

    //CONSTRUCTOR
    public Account(int balance){
        this.balance = balance;
    }


    //GETTER
    public int getBalance() {
        return balance;
    }

    //METHODS
    public abstract void showInfo();


}
