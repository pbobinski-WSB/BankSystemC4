package wsb.po.testy;

import wsb.po.banking.CheckingAccount;
import wsb.po.banking.NegativeDepositException;
import wsb.po.banking.OverdraftException;

public class TestKont {

    public static void main(String[] args) {//throws NegativeDepositException {

        try {

            CheckingAccount checkingAccount1 = new CheckingAccount(100);
            System.out.println(checkingAccount1);
            checkingAccount1.withdraw(20);
            System.out.println(checkingAccount1);
            checkingAccount1.withdraw(50);
            System.out.println(checkingAccount1);
            System.out.println("+++++++");

            CheckingAccount checkingAccount2 = new CheckingAccount(100, 100);
            try {
                checkingAccount2.deposit(100);
            } catch (NegativeDepositException ex) {
                System.out.println("!!!!!!!!!!!!!!!błąd wpłaty " + ex);
            }

            System.out.println(checkingAccount2);
            checkingAccount2.withdraw(400);
            System.out.println(checkingAccount2);
            checkingAccount2.withdraw(50);
            System.out.println(checkingAccount2);
            checkingAccount2.withdraw(200);
            System.out.println(checkingAccount2);

        } catch (OverdraftException ex) {
            System.out.println("!!!!!!!!!!!błąd wypłaty, przektoczono stan konta i limit o "+ex.getDeficit());
        }
    }
}
