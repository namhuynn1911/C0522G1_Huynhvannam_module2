package ss6_Inheritance.exercise.CircleCylinderBT1.model;

public class Cylinder extends NewCircle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    public String toString() {
        return String.format("bán kính hình trụ : %1.2f , chiều cao : %1.2f, diện tích : %1.2f " + super.toString(),
                getRadius(), getHeight(), getArea());
    }
}
