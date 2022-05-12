package wsb.po.testy;

import wsb.po.banking.CheckingAccount;

public class TestKont {

    public static void main(String[] args) {

        CheckingAccount checkingAccount1 = new CheckingAccount(100);
        System.out.println(checkingAccount1);
        System.out.println(checkingAccount1.withdraw(200));
        System.out.println(checkingAccount1);
        System.out.println(checkingAccount1.withdraw(50));
        System.out.println(checkingAccount1);
        System.out.println("+++++++");

        CheckingAccount checkingAccount2 = new CheckingAccount(200,100);
        System.out.println(checkingAccount2);
        System.out.println(checkingAccount2.withdraw(400));
        System.out.println(checkingAccount2);
        System.out.println(checkingAccount2.withdraw(50));
        System.out.println(checkingAccount2);
        System.out.println(checkingAccount2.withdraw(200));
        System.out.println(checkingAccount2);

    }
}
