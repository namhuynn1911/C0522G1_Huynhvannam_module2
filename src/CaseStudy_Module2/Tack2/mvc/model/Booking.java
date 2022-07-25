package CaseStudy_Module2.Tack2.mvc.model;

public class Booking {
    private String codeBooking;
    private int firstDay;
    private int endDate;
    private String codeCustomer;
    private String serviceName;
    private String typeService;

    public Booking() {
    }

    public Booking(String codeBooking, int firstDay, int endDate, String codeCostomer, String serviceName, String typeService) {
        this.codeBooking = codeBooking;
        this.firstDay = firstDay;
        this.endDate = endDate;
        this.codeCustomer = codeCostomer;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(int firstDay) {
        this.firstDay = firstDay;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", firstDay=" + firstDay +
                ", endDate=" + endDate +
                ", codeCostomer='" + codeCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
