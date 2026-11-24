package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        /*
         * 1. Did the deposit work for both accounts? Why or why not?
         *    No. It only worked for account1. account2.deposit(100) gives a
         *    compile error because account2 is declared as a Valuable.
         *
         * 2. What methods are available for account1?
         *    All the BankAccount methods: deposit(), withdraw(), getValue(),
         *    getBalance(), getName() and getAccountNumber().
         *
         * 3. What methods are available for account2?
         *    Only getValue(), because that is the only method in the
         *    Valuable interface.
         *
         * 4. Why?
         *    Java only lets you use the methods of the variable's declared
         *    type (the left side), not the actual object. Both are real
         *    BankAccount objects, but account2 is labeled as Valuable, and
         *    Valuable only knows about getValue().
         */
    }
}
