package com.qa;

import java.util.Arrays;

public class Account implements Comparable<Account>{

    private String cardTypes[];
    private String sortCode;
    private String accountNumbers;
    private String password;

    public Account(String[] cardTypes, String sortCode, String accountNumbers, String password) {
        super();
        this.cardTypes = cardTypes;
        this.sortCode = sortCode;
        this.accountNumbers = accountNumbers;
        this.password = password;
    }

    public String[] getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        this.cardTypes = cardTypes;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(String accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account has : " +
                "cardTypes: " + Arrays.toString(cardTypes) +
                ", sortCode: " + sortCode + '\'' +
                ", accountNumbers: " + accountNumbers + '\'' +
                ", password: " + password + '\'';
    }

    @Override
    public int compareTo(Account thatAct){
        if (Arrays.asList(this.cardTypes).contains(thatAct.cardTypes[0]))
            if (this.sortCode.equals(thatAct.sortCode))
                if(this.accountNumbers.equals(thatAct.accountNumbers))
                    if(this.password.equals(thatAct.password))
                    {
                        return 0; // it will log in
                    }
        return -1;   // it won t log in
    }
}
