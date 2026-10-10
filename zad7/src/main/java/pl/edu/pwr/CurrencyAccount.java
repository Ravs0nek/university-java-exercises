package pl.edu.pwr;

public class CurrencyAccount {
    private final String currency;
    private double balance;

    public CurrencyAccount(String currency, double initialBalance) {
        this.currency = currency;
        this.balance = initialBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}