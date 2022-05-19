package wsb.po.testy;

import wsb.po.banking.domain.Account;
import wsb.po.banking.domain.Bank;
import wsb.po.banking.domain.CheckingAccount;
import wsb.po.banking.domain.SavingsAccount;
import wsb.po.banking.reports.CustomerReport;

public class TestBanking {

    public static void main(String[] args) {

//        Bank bank = new Bank();
        Bank bank = Bank.getBank();

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

        CustomerReport customerReport = new CustomerReport();

        customerReport.generateReport();


    }

}
