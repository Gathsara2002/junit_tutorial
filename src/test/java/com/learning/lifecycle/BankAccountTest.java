package com.learning.lifecycle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    //call before every test method
    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
        account = new BankAccount();
    }

    @Test
    void shouldDepositMoney() {
        System.out.println("Test: deposit");

        account.deposit(100);

        assertEquals(100, account.getBalance());
    }

    @Test
    void shouldWithdrawMoney() {
        System.out.println("Test: withdraw");

        account.deposit(100);
        account.withdraw(30);

        assertEquals(70, account.getBalance());
    }
}