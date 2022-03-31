package wsb.po.testy;

import wsb.po.banking.Account;
import wsb.po.banking.Customer;

public class TestBanking {

    public static void main(String[] args) {

        Customer customer;
        Account account;

        System.out.println("Tworzenie klienta Jane Smith.");
        customer = new Customer("Jane", "Smith");
        System.out.println("Utworzono klienta "+customer);

        System.out.println("Tworzenie konta z saldem 500,00.");
        account = new Account(500);
        System.out.println("Dodanie konta do klienta");
        customer.setAccount(account);
        System.out.println("Stan klienta "+customer);

        account.withdraw(150);
        account.deposit(22.5);
        account.withdraw(47.62);

        System.out.println("Stan klienta "+customer);

    }

}
