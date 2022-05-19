package wsb.po.banking.domain;

public class NegativeDepositException extends Exception{

    public NegativeDepositException(String message) {
        super(message);
    }
}
