package wsb.po.banking;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit (double amount) {
        //balance = balance + amount;
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw (double amount) {
        //balance = balance - amount;
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + String.format("%.2f",balance) +
                '}';
    }
}
