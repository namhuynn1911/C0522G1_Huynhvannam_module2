package CaseStudy_Module2.Tack2.mvc.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return null;
    }

    public Customer(String code, String name, String dateOfBirth, String gender,
                    int id, int numberPhone, String email, String customerType, String address) {
        super(code, name, dateOfBirth, gender, id, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
