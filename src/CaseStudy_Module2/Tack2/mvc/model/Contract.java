package CaseStudy_Module2.Tack2.mvc.model;

public class Contract {
    private int someContracts;
    private String codeBooking;
    private double deposit;
    private double totalPayment;
    private String customerCode;

    public Contract() {
    }

    public Contract(int someContracts, String codeBooking, double deposit, double totalPayment, String customerCode) {
        this.someContracts = someContracts;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts=" + someContracts +
                ", codeBooking='" + codeBooking + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}

