package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void totalBalance() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-50);
        cashMachine2.add(300);
        cashMachine2.add(-30);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2});

        //when
        int totalBalance = bank.getTotalBalance();

        //then
        assertEquals(420, totalBalance);
    }

    @Test
    public void numberOfWithdrawals() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-50);
        cashMachine2.add(300);
        cashMachine2.add(-30);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2});

        //when
        int totalWithdraw = bank.getWithdrawalsNumber();

        //then
        assertEquals(2, totalWithdraw);
    }

    @Test
    public void numberOfDeposits() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-50);
        cashMachine2.add(300);
        cashMachine2.add(-30);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2});

        //when
        int totalDeposits = bank.getDepositNumber();

        //then
        assertEquals(2, totalDeposits);
    }

    @Test
    public void averageOfWithdrawals() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-50);
        cashMachine2.add(300);
        cashMachine2.add(-30);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2});

        //when
        double averageWithdraw = bank.getWithdrawnSum();

        //then
        assertEquals(-80, averageWithdraw);
    }

    @Test
    public void shouldCountAverageOfDeposits() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-50);
        cashMachine2.add(300);
        cashMachine2.add(-30);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2});

        //when
        double averageDeposits = bank.getDepositSum();

        //then
        assertEquals(500, averageDeposits);
    }
}
