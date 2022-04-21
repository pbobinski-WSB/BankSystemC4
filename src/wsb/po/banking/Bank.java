package wsb.po.banking;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>();



    public Bank() {
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
