package CaseStudy_Module2.Tack2.mvc.model;



public class House extends Facility {
    private String standard;
    private int floorNumber;

    public House() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%d,%d,%d,%s,%s,%d",this.getServiceName(),this.getUsableArea(),this.getRent(),
                this.getAmountMax(),this.getTime(),this.getStandard(),this.getFloorNumber());
    }

    public House(String serviceName, int usableArea, double rent, int amountMax,
                 String time, String standard, int floorNumber) {
        super(serviceName, usableArea, rent, amountMax, time);
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
        return "House " +
                "standard='" + standard + '\'' +
                ", floorNumber=" + floorNumber;
    }
}
