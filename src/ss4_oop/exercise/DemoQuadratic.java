package ss4_oop.exercise;


import java.util.Scanner;

class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA;

        do {
            System.out.print("Enter the a:");
            numberA = scanner.nextDouble();
            if (numberA == 0) {
                System.out.println("a#0.yêu cầu nhập lại");
            }
        } while (numberA == 0);

        System.out.print("Enter the b:");
        double numberB = scanner.nextDouble();
        System.out.print("Enter the c:");
        double numberC = scanner.nextDouble();

        DemoQuadratic quadraticEquation = new DemoQuadratic(numberA, numberB, numberC);
        System.out.println("giá trị delta " + quadraticEquation.getDelta());
        System.out.println(quadraticEquation.display());
    }
}

public class DemoQuadratic {
    double a, b, c;

    public DemoQuadratic(double a, double b, double c) {
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

