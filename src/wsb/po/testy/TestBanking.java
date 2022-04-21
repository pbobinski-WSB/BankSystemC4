package wsb.po.testy;

import wsb.po.banking.Account;
import wsb.po.banking.Bank;
import wsb.po.banking.Customer;

public class TestBanking {

    public static void main(String[] args) {

   /*
  Customer: Simms, Jane
    Account 1: current balance is ¤ 500.00
    Account 2: current balance is ¤ 200.00
Customer: Bryant, Owen
    Account 1: current balance is ¤ 200.00
Customer: Soley, Tim
    Account 1: current balance is ¤ 1,500.00
    Account 2: current balance is ¤ 200.00
    Account 3: current balance is ¤ 200.00
Customer: Soley, Maria
    Account 1: current balance is ¤ 200.00
    Account 2: current balance is ¤ 150.00

    */

        Bank bank = new Bank();

        bank.addCustomer("Simms" , "Jane");
        bank.addCustomer("Bryant" , "Owen");
        bank.addCustomer("Soley" , "Tim");
        bank.addCustomer("Soley" , "Maria");

        bank.getCustomer(0).addAccount(new Account(500));
        bank.getCustomer(0).addAccount(new Account(200));
        bank.getCustomer(1).addAccount(new Account(200));
        bank.getCustomer(2).addAccount(new Account(1500));
        bank.getCustomer(2).addAccount(new Account(200));
        bank.getCustomer(2).addAccount(new Account(200));
        bank.getCustomer(3).addAccount(new Account(200));
        bank.getCustomer(3).addAccount(new Account(150));


        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i).getFirstName()+", "+bank.getCustomer(i).getLastName());
            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccouts(); j++) {
                System.out.println("Account "+(j+1)+": current balance is "+bank.getCustomer(i).getAccount(j).getBalance());
            }
        }

    }

}
