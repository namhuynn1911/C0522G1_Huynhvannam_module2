package ss15_exception_debug.exercise.triangleException;

import ss15_exception_debug.exercise.triangleException.mbcBT1.model.IllegalTriangleException;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhập vào cạnh a: ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.println("nhập vào cạnh b: ");
                b = Integer.parseInt(scanner.nextLine());

                System.out.println("nhập vào cạnh c: ");
                c = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số,yêu cầu nhập lại");
            }
        }
        checkTriangle(a, b, c);
    }

    public static void checkTriangle(int a, int b, int c) {
        boolean checkCondition = (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (c + b > a));
        if (!checkCondition) {
            try {
                throw new IllegalTriangleException("ngoại lệ.không phải là ba cạnh cảu một tam giác");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.printf("ba cạnh của tam giác là:\nthứ nhất %d \n" +
                    "thứ 2 %d \n" +
                    "thứ 3 %d ",a,b,c);
        }
    }
}

