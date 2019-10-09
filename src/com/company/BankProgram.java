package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class BankProgram {

    //FIELDS
    int numberOfCreatedAccounts;
    ArrayList<Account> accounts = new ArrayList<>();

    //METHODS
    public void start() {

        boolean isRunning = true;
        while (isRunning)
            switch (View.getInstance().showMenuAndGetChoice()) {
                case ADD_SALARY_ACCOUNT:
                    addToAccountsList(BankAccountFactory.createAccount(BankAccountFactory.AccountType.SALARY));
                    break;
                case ADD_SAVINGS_ACCOUNT:
                    addToAccountsList(BankAccountFactory.createAccount(BankAccountFactory.AccountType.SAVINGS));
                    break;
                case ADD_INVESTMENT_ACCOUNT:
                    addToAccountsList(BankAccountFactory.createAccount(BankAccountFactory.AccountType.INVESTMENT));
                    break;
                case ADD_LOAN_ACCOUNT:
                    addToAccountsList(BankAccountFactory.createAccount(BankAccountFactory.AccountType.LOAN));
                    break;
                case SAVE_ACCOUNTS:
                    FileUtility.saveObject(accounts,"accounts.ser", StandardOpenOption.CREATE);
                    break;
                case LOAD_ACCOUNTS:
                    if (Files.exists(Paths.get("accounts.ser"))){
                        accounts = (ArrayList<Account>) FileUtility.loadObject("accounts.ser");
                    }
                    else {
                        System.out.println("No accounts have been saved.");
                    }
                    break;
                case SHOW_ACCOUNTS:
                    showAccounts();
                    break;
                case QUIT:
                    isRunning = false;
                    break;
                default:
                    View.getInstance().showErrorMessage("No such menu item...");
            }
    }

    private void addToAccountsList(Account account) {
        if (account != null)
            accounts.add(account);
    }

    public void showAccounts() {
        for (Account account : accounts) {
            account.showInfo();
        }
    }

}