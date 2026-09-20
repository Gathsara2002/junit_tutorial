package com.learning.lifecycle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeAll
    static void setUpAll(){
        System.out.println("Before All");
    }

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

    //After every test method this execute
    @AfterEach
    void tearDown() {
        account = null;
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After All");
    }
}