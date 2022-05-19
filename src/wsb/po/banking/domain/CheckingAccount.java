package wsb.po.banking.domain;

public class CheckingAccount extends Account{

    private double overdraftProtecion = 0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public double getOverdraftProtecion() {
        return overdraftProtecion;
    }

    public CheckingAccount(double balance, double overdraftProtecion) {
        super(balance);
        this.overdraftProtecion = overdraftProtecion;
    }

    @Override
    public void withdraw(double amount) throws OverdraftException{

        if (amount > getBalance() + overdraftProtecion) {
            throw new OverdraftException("bład wypłaty brak środków i limitu",amount - (getBalance() + overdraftProtecion));
        } else {
            if (amount < getBalance()) {
                super.withdraw(amount);
            } else {
                overdraftProtecion -= amount-getBalance();
                System.out.println("****"+getBalance());
                super.withdraw(getBalance());
            }
        }

    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftProtecion=" + overdraftProtecion +
                '}'+super.toString();
    }
}
