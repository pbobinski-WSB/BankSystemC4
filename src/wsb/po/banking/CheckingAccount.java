package wsb.po.banking;

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
    public boolean withdraw(double amount) {

        if (amount > getBalance() + overdraftProtecion) {
            return false;
        } else {
            if (amount < getBalance()) {
                return super.withdraw(amount);
            } else {
                overdraftProtecion -= amount-getBalance();
                System.out.println("****"+getBalance());
                return super.withdraw(getBalance());
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
