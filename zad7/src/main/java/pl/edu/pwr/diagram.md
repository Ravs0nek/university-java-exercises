# Diagram Klas - Zadanie 7

```mermaid
classDiagram
    class CurrencyAccount {
        -String currency
        -double balance
        +CurrencyAccount(String, double)
        +getCurrency() String
        +getBalance() double
        +deposit(double) void
    }

    class ExchangeService {
        -double exchangeRate
        +ExchangeService(double)
        +convertAndDeposit(CurrencyAccount, double) void
    }

    class Main {
        +main(String[] args)$ void
    }

    ExchangeService ..> CurrencyAccount : modyfikuje
    Main ..> CurrencyAccount : tworzy
    Main ..> ExchangeService : używa