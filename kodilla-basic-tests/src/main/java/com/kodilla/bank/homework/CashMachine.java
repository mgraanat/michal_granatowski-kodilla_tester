package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;
    private int cashMachineBalance = 0;

    public CashMachine() {
        this.transactions = new int[0];
    }

    public void add (int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab,0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int[] getTransactions() {
        return transactions;
    }
    public int depositMoney;
}
