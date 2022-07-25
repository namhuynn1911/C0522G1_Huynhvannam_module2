package CaseStudy_Module2.Tack2.mvc.model;

public abstract class Facility {
    private String serviceName;
    private int usableArea;
    private double rent;
    private int amountMax;
    private  String time;

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, double rent, int amountMax, String time) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rent = rent;
        this.amountMax = amountMax;
        this.time = time;
    }
    public abstract String getInfo();

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(int amountMax) {
        this.amountMax = amountMax;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Facility " +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rent=" + rent +
                ", amountMax=" + amountMax +
                ", time='" + time + '\'';
    }
}

