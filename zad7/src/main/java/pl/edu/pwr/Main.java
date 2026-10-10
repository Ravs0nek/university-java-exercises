package pl.edu.pwr;

public class Main {
    public static void main(String[] args) {
        CurrencyAccount eurAccount = new CurrencyAccount("EUR", 100.0);
        ExchangeService service = new ExchangeService(4.25);

        service.convertAndDeposit(eurAccount, 425.0);

        System.out.println("Saldo konta " + eurAccount.getCurrency() + ": " + eurAccount.getBalance());
    }
}