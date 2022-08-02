package ss17_binary_file.lamthem.mvc_phone.dethinganhang.model;

public abstract class Bank {
    private int id;
    private String  accountCode;
    private String namne;
    private String bankCreationDate;

    public Bank() {
    }

    public Bank(int id, String accountCode, String namne, String bankCreationDate) {
        this.id = id;
        this.accountCode = accountCode;
        this.namne = namne;
        this.bankCreationDate = bankCreationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getNamne() {
        return namne;
    }

    public void setNamne(String namne) {
        this.namne = namne;
    }

    public String getBankCreationDate() {
        return bankCreationDate;
    }

    public void setBankCreationDate(String bankCreationDate) {
        this.bankCreationDate = bankCreationDate;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return "Bank" +
                "id=" + id +
                ", accountCode=" + accountCode +
                ", namne='" + namne + '\'' +
                ", bankCreationDate='" + bankCreationDate ;
    }
}
