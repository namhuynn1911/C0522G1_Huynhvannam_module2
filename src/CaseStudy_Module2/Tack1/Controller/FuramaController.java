package CaseStudy_Module2.Tack1.Controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int number;
        do {
            System.out.println("Menu");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("nhập vào số menu");
            number =sr.nextInt();
            if(number<0||number>6) {

                System.out.println("yêu cầu nhập lại");
            }
        } while (number<0||number>6);
        displayMainMenu(number);
    }
    public static void displayMainMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.println("1\t Display list employees");
                System.out.println("2\tAdd new employee");
                System.out.println("3\tEdit employee");
                System.out.println("4\tReturn main menu");
                break;
            case 2:
                System.out.println("1.\tDisplay list customers");
                System.out.println("2.\tAdd new customer");
                System.out.println("3.\tEdit customer");
                System.out.println("4.\tReturn main menu");
                break;
            case 3:
                System.out.println("1\tDisplay list facility");
                System.out.println("2\tAdd new facility");
                System.out.println("3\tDisplay list facility maintenance");
                System.out.println("4\tReturn main menu");
                break;
            case 4:
                System.out.println("1.\tAdd new booking");
                System.out.println("2.\tDisplay list booking");
                System.out.println("3.\tCreate new constracts");
                System.out.println("4.\tDisplay list contracts");
                System.out.println("5.\tEdit contracts");
                System.out.println("6.\tReturn main menu");
                break;
            case 5:
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                break;
            case 6:
                System.exit(6);
        }
    }
}
