package wsb.po.testy;

import wsb.po.banking.Account;

public class TestBanking {

    public static void main(String[] args) {

        System.out.println("Tworzenie konta z saldem 500,00.");

        Account account = new Account(500);

        System.out.println("Utworzono konto "+account);

        account.withdraw(150);
        account.deposit(22.5);
        account.withdraw(47.62);

        System.out.println("Stan konta "+account);

    }

    /*
    Tworzenie konta z saldem 500,00.
Wypłata 150,00
Wpłata 22,50
Wypłata 47,62
Saldo na koncie 324,88

     */

}
