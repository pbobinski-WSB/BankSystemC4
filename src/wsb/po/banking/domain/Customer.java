package wsb.po.banking.domain;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;

    private ArrayList<Account> accounts = new ArrayList<Account>();



    public int getNumberOfAccouts() {
        return accounts.size();
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number of accounts = " + accounts.size() +
                '}';
    }
}
