package CaseStudy_Module2.Tack2.mvc.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%d,%d,%s,%s,%s \n",this.getCode(),this.getName(),this.getDateOfBirth(),this.getGender(),
                this.getId(),this.getNumberPhone(),this.getEmail(),this.getCustomerType(),this.getAddress());
    }

    public Customer(String code, String name, String dateOfBirth, String gender,
                    int id, int numberPhone, String email, String customerType, String address) {
        super(code, name, dateOfBirth, gender, id, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
        return super.toString()+ " customerType='" + customerType + '\'' +
                ", address='" + address + '\'';
    }
}
