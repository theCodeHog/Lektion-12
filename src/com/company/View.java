package com.company;

import java.util.Scanner;

public class View {

    public enum MenuItem {
        ADD_SALARY_ACCOUNT("Add salary account."),
        ADD_SAVINGS_ACCOUNT("Add savings account."),
        ADD_INVESTMENT_ACCOUNT("Add investment account."),
        ADD_LOAN_ACCOUNT("Add loan account."),
        SAVE_ACCOUNTS("Save accounts to file."),
        LOAD_ACCOUNTS("Load accounts from file."),
        SHOW_ACCOUNTS("Show accounts."),
        QUIT("Quit the program.")
        ;

        private String description;
        MenuItem(String description){
            this.description = description;
        }
    }

    private static View instance = null;

    private View() {
        //No one can get at this constructor! It's private!
    }

    public static View getInstance() {
        if (instance == null) { //if we haven't created an object of this class yet...
            instance = new View(); //...create it now!
            //this ensures the object will only be created once!
        }
        return instance;
    }

    public MenuItem showMenuAndGetChoice() {
        System.out.println("Welcome to the bank.\nMake a choice:\n------");
        int i = 1; //loop to show the menu of ENUMS
        for (MenuItem menuItem : MenuItem.values()){
            System.out.println(i+" "+menuItem.description);
            i++;
        }

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        return MenuItem.values()[userChoice-1];//returns the corresponding menu item
        //we add -1 because menu item 1 is placed in enum place 0.
    }

    public void showErrorMessage(String errorMessage){
        System.out.println("Error: "+errorMessage);
    }


}
