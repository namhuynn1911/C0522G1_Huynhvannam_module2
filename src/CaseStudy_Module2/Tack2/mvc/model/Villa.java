package CaseStudy_Module2.Tack2.mvc.model;

import CaseStudy_Module2.Tack2.mvc.model.Facility;

public class Villa extends Facility {
    private String standard;
    private double poolArea;
    private int floorNumber;

    public Villa() {
    }

    @Override
    public String getInfo() {
        return null;
    }

    public Villa(String standard, double poolArea, int floorNumber) {
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public Villa(String serviceName, int usableArea, double rent, int amountMax,
                 String time, String standard, double poolArea, int floorNumber) {
        super(serviceName, usableArea, rent, amountMax, time);
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa " +
                "standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumber=" + floorNumber;
    }
}
