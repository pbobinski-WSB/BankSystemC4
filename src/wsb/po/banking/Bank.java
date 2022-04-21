package wsb.po.banking;

public class Bank {

    private Customer [] customers = new Customer[20];

    private int numberOfCustomers = 0;

    public Bank() {
    }

    public void addCustomer(String f, String l) {
        customers[numberOfCustomers++] = new Customer(f, l);
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer (int index) {
        return customers[index];
    }
}
