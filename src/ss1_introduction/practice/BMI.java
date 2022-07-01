package ss1_introduction.practice;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("nhập vào cân nặng");
        double weight = scr.nextDouble();

        System.out.print("nhập vào chiều cao");
        double height = scr.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Uderweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
