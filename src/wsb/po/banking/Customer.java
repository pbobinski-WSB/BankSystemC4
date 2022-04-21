package wsb.po.banking;

public class Customer {

    private String firstName;
    private String lastName;

    private Account [] accounts = new Account[10];

    private int numberOfAccouts = 0;

    public int getNumberOfAccouts() {
        return numberOfAccouts;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public void addAccount(Account account) {
        accounts[numberOfAccouts++] = account;
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
                ", number of accounts = " + numberOfAccouts +
                '}';
    }
}
