package com.learning.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Nested
    class DepositTests {

        @Test
        void shouldDepositMoney() {

            account.deposit(100);

            assertEquals(100, account.getBalance());
        }

        @Test
        void shouldRejectNegativeDeposit() {

            assertThrows(
                    IllegalArgumentException.class,
                    () -> account.deposit(-100)
            );
        }
    }

    @Nested
    class WithdrawTests {

        @Test
        void shouldWithdrawMoney() {

            account.deposit(100);
            account.withdraw(30);

            assertEquals(70, account.getBalance());
        }

        @Test
        void shouldRejectInsufficientBalance() {

            assertThrows(
                    IllegalArgumentException.class,
                    () -> account.withdraw(100)
            );
        }
    }
}