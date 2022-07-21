package ss15_exception_debug.exercise.triangleException.mbcBT1.controller;

import ss15_exception_debug.exercise.triangleException.mbcBT1.model.IllegalTriangleException;
import ss15_exception_debug.exercise.triangleException.mbcBT1.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEdge;
        int secondEdge;
        int thirdEdge;
        while (true) {
            try {
                System.out.println("nhập vào cạnh a: ");
                firstEdge = Integer.parseInt(scanner.nextLine());

                System.out.println("nhập vào cạnh b: ");
                secondEdge = Integer.parseInt(scanner.nextLine());

                System.out.println("nhập vào cạnh c: ");
                thirdEdge = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(firstEdge, secondEdge, thirdEdge);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số,yêu cầu nhập lại");
            } catch (IllegalArgumentException e) {

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }


    }

}
