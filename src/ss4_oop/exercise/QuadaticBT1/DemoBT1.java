package ss4_oop.exercise.QuadaticBT1;

import ss4_oop.exercise.DemoQuadratic;

import java.util.Scanner;

public class DemoBT1 {
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


