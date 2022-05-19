package wsb.po.banking.domain;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    private static Bank bankInstance = null;

    public static Bank getBank() {
        if (bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    private Bank() {
    }

    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer (int index) {
        return customers.get(index);
    }
}
