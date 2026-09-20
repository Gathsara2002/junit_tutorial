package com.learning.lifecycle;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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


    //parameterized tests
    @ParameterizedTest
    @ValueSource(ints = {100, 200, 500})
    void shouldDepositMoney(int amount) {

        account.deposit(amount);

        assertEquals(amount, account.getBalance());
    }

    @ParameterizedTest
    @CsvSource({
            "100, 100",
            "200, 200",
            "500, 500"
    })
    void shouldDepositMoney(int amount, int expectedBalance) {

        account.deposit(amount);

        assertEquals(expectedBalance, account.getBalance());
    }

    @ParameterizedTest
    @MethodSource("depositTestData")
    void shouldCalculateBalance(
            int startingBalance,
            int depositAmount,
            int expectedBalance) {

        account.deposit(startingBalance);
        account.deposit(depositAmount);

        assertEquals(expectedBalance, account.getBalance());
    }

    static Stream<Arguments> depositTestData() {

        return Stream.of(
                Arguments.of(100, 50, 150),
                Arguments.of(200, 100, 300),
                Arguments.of(500, 250, 750)
        );
    }
}