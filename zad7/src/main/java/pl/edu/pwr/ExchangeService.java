package pl.edu.pwr;

public class ExchangeService {
    private final double exchangeRate;

    public ExchangeService(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void convertAndDeposit(CurrencyAccount targetAccount, double amountPln) {
        double converted = amountPln / exchangeRate;
        targetAccount.deposit(converted);
    }
}