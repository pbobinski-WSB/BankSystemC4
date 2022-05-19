package wsb.po.banking;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) throws NegativeDepositException {
        //balance = balance + amount;
        if (amount > 0) {
            balance += amount;
        } else {
            throw new NegativeDepositException("ujemna wpłata");
        }
    }
    public void withdraw (double amount) throws OverdraftException {
        //balance = balance - amount;
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new OverdraftException("bład wypłaty brak środków",amount - balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + String.format("%.2f",balance) +
                '}';
    }
}
