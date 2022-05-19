package wsb.po.banking;

public class NegativeDepositException extends Exception{

    public NegativeDepositException(String message) {
        super(message);
    }
}
