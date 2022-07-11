package ss07_Abstract_Interfacce.exercise.BT2.model;

public class Circle extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return (getRadius() * 2) * Math.PI;
    }

    public String toString() {
        return "A Circle with " + getRadius() + "," + " which is a subclass of " + super.toString();
    }
}

