package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;
    private int balance;

    public CashMachine() {
        this.transactions = new int[0];
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int checkBalance() {
        int balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }


    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int payment (int value){
        balance = balance + value;
        add(value);
        return balance;
    }
    public int cashWithdrawal(int value){
        balance = balance - value;
        add(-value);
        return balance;
    }
}
