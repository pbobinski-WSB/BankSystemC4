package wsb.po.testy;

import wsb.po.banking.Account;
import wsb.po.banking.Bank;
import wsb.po.banking.Customer;

public class TestBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("PAWEL" , "WLASZCZIAK");
        bank.addCustomer("JAN" , "PIOTRKOWSKI");
        bank.addCustomer("NOWAKOWSKI" , "STEFAN");
        bank.addCustomer("NOWAKOWSKA" , "URSZULA");

        bank.getCustomer(0).addAccount(new Account(1500));
        bank.getCustomer(0).addAccount(new Account(1200));
        bank.getCustomer(1).addAccount(new Account(1200));
        bank.getCustomer(2).addAccount(new Account(2500));
        bank.getCustomer(2).addAccount(new Account(1200));
        bank.getCustomer(2).addAccount(new Account(1200));
        bank.getCustomer(3).addAccount(new Account(1200));
        bank.getCustomer(3).addAccount(new Account(1150));


        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i).getFirstName()+", "+bank.getCustomer(i).getLastName());
            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccouts(); j++) {
                System.out.println("Account "+(j+1)+": current balance is "+bank.getCustomer(i).getAccount(j).getBalance());
            }
        }

    }

}
