package ss17_binary_file.lamthem.mvc_phone.dethinganhang.model;

public class PaymentAccount extends Bank{
    private String cardNumber;
    private String accountNumber;

    public PaymentAccount() {
    }

    public PaymentAccount(int id, String accountCode, String namne, String bankCreationDate,
                          String cardNumber, String accountNumber) {
        super(id, accountCode, namne, bankCreationDate);
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getId(),this.getAccountCode(),
                this.getNamne(),this.getBankCreationDate(),this.getCardNumber(),this.getAccountNumber());
    }

    @Override
    public String toString() {
        return super.toString()+" cardNumber='" + cardNumber + '\'' +
                ", accountNumber='" + accountNumber ;
    }
}
