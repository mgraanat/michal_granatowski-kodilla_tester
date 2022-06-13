package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void zeroLength() {
        CashMachine machine = new CashMachine();
        int[] transactions = machine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void addTest() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
    }
}
