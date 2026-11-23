package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public CreditCard(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void charge(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void pay(double amount) {
        balance = balance.subtract(BigDecimal.valueOf(amount));
    }

    @Override
    public double getValue() {
        return balance.negate().doubleValue();
    }
}