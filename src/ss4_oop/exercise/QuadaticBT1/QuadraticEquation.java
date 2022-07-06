package ss4_oop.exercise.QuadaticBT1;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }


    public double getDelta() {
        return (getB() * getB()) - (4 * getA() * getC());
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDelta())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDelta())) / (2 * getA());
    }

    public String display() {
        if (getDelta() < 0) {
            return "phương trình vô nghiệm";
        }

        if (getDelta() == 0) {
            return "Phương trình có nghiệm kép x1 = x2 = " + getRoot1();
        }

        return "Phương trình có hai nghiệm x1 = " + getRoot1() + "\n" + "x2 = " + getRoot2();
    }
}

