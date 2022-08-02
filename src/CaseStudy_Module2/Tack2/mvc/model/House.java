package CaseStudy_Module2.Tack2.mvc.model;



public class House extends Facility {
    private String standard;
    private int floorNumber;

    public House() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceId(),this.getServiceName(),this.getUsableArea(),this.getRent(),
                this.getAmountMax(),this.getTime(),this.getStandard(),this.getFloorNumber());
    }

    public House(String serviceId, String serviceName, int usableArea, double rent,
                 int amountMax, String time, String standard, int floorNumber) {
        super(serviceId, serviceName, usableArea, rent, amountMax, time);
        this.standard = standard;
        this.floorNumber = floorNumber;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                " standard='" + standard +
                ", floorNumber=" + floorNumber;
    }
}
