package wsb.po.banking.reports;

import wsb.po.banking.domain.Account;
import wsb.po.banking.domain.Bank;
import wsb.po.banking.domain.CheckingAccount;

public class CustomerReport {

    public void generateReport () {

        Bank bank = Bank.getBank();

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
