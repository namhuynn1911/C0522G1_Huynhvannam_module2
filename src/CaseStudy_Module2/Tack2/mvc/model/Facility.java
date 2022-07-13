package CaseStudy_Module2.Tack2.mvc.model;

public abstract class Facility {
    private int bed;
    private int airConditioner;
    public Facility() {

    }
    public Facility(int rent,int rentalTime) {
        this.bed=rent;
        this.airConditioner =rentalTime;
    }

    public double getRent() {
        return bed;
    }

    public void setRent(int rent) {
        this.bed = rent;
    }

    public int getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(int airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "bed=" + bed +
                ", airConditioner=" + airConditioner +
                '}';
    }
}
