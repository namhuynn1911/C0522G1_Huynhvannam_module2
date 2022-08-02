package ss17_binary_file.lamthem.mvc_phone.excption;

public class NotFountBankAccountException extends Exception{
    public NotFountBankAccountException(String massage){
        super(massage);
    }
}
