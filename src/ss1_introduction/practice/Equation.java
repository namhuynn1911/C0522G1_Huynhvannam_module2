package ss1_introduction.practice;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner input = new Scanner(System.in);
        System.out.print("a :");
        double a = input.nextDouble();

        System.out.print("b :");
        double b = input.nextDouble();

        System.out.print("c :");
        double c = input.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x ="+ answer);
        } else {
            if (b == c) {
                System.out.print("Equation pass with x =");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}

