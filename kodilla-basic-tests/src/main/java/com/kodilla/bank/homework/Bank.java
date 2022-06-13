package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {
        int balance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            balance += cashMachines[i].checkBalance();
        }
        return balance;
    }

    public int getWithdrawalsNumber() {
        int withdraw = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    withdraw++;
                }
            }
        }
        return withdraw;
    }

    public int getDepositNumber() {
        int deposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    deposit++;
                }
            }
        }
        return deposit;
    }

    public int getWithdrawnSum() {
        int withdraw = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    withdraw += transactions[j];
                }
            }
        }
        return withdraw;
    }

    public int getDepositSum() {
        int deposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    deposit += transactions[j];
                }
            }
        }
        return deposit;
    }
}
