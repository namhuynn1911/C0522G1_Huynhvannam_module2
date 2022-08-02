package ss17_binary_file.lamthem.mvc_phone.dethinganhang.model;

public class SavingAccount extends Bank{
    private int deposits;
    private String depositDate;
    private String interest;
    private String tenor;

    public SavingAccount() {
    }

    public SavingAccount(int id, String accountCode, String namne, String bankCreationDate,
                         int deposits, String depositDate, String interest, String tenor) {
        super(id, accountCode, namne, bankCreationDate);
        this.deposits = deposits;
        this.depositDate = depositDate;
        this.interest = interest;
        this.tenor = tenor;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",this.getId(),this.getAccountCode(),
                this.getNamne(),this.getBankCreationDate(),this.getDeposits(),this.getDepositDate(),this.getInterest(),
                this.getTenor());
    }

    @Override
    public String toString() {
        return super.toString()+" deposits=" + deposits +
                ", depositDate='" + depositDate + '\'' +
                ", interest=" + interest +
                ", tenor='" + tenor;
    }
}
