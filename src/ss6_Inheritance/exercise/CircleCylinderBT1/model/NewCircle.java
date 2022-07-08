package ss6_Inheritance.exercise.CircleCylinderBT1.model;

public class NewCircle {
    private double radius;
    private String color;

    public NewCircle() {

    }

    public NewCircle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String toString() {
        return String.format(" màu của hình là: %s ,radius : %1.2f", getColor(), getRadius());
    }
}

