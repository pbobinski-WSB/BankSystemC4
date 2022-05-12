package wsb.po.testy;

import wsb.po.banking.*;

import java.util.concurrent.Callable;

public class TestBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("PAWEL" , "WLASZCZIAK");
        bank.addCustomer("JAN" , "PIOTRKOWSKI");
        bank.addCustomer("NOWAKOWSKI" , "STEFAN");
        bank.addCustomer("NOWAKOWSKA" , "URSZULA");

        bank.getCustomer(0).addAccount(new SavingsAccount(1500,0));
        bank.getCustomer(0).addAccount(new CheckingAccount(1200));
        bank.getCustomer(1).addAccount(new SavingsAccount(1200,1));
        bank.getCustomer(2).addAccount(new CheckingAccount(2500,1000));
        bank.getCustomer(2).addAccount(new SavingsAccount(1200,5));
        bank.getCustomer(2).addAccount(new CheckingAccount(1200,50));
        bank.getCustomer(3).addAccount(new SavingsAccount(1200,10));
        bank.getCustomer(3).addAccount(new CheckingAccount(1150,100));


        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i).getFirstName()+", "+bank.getCustomer(i).getLastName());
            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccouts(); j++) {
                System.out.println("Account "+(j+1)+": current account is "+bank.getCustomer(i).getAccount(j));
                Account account = bank.getCustomer(i).getAccount(j);
                if (account instanceof CheckingAccount) {
                   CheckingAccount checkingAccount = (CheckingAccount) account;
                    System.out.println("Limit do wykorzystania "+checkingAccount.getOverdraftProtecion());
                }
            }
        }

    }

}
