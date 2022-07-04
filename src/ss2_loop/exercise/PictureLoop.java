package ss2_loop.exercise;

import java.util.Scanner;

public class PictureLoop {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.println("1. vẽ hình chữ nhật");
        System.out.println("2. vẽ tam giác vuông thuận. ");
        System.out.println("3. vẽ tam giác vuông ngược. ");
        System.out.println("0 .Exit");
        int choice =sr.nextInt();
        switch (choice) {
            case 1:
                System.out.println("nhập vào chiều dài");
                int n =sr.nextInt();
                System.out.println("nhập vào chiều dài");
                int m =sr.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            case 2:
                System.out.println("nhập vào chiều cao hình vuông");
                int h = sr.nextInt();
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            case 3:
                System.out.println("nhập vào chiều cao hình vuông");
                int hight = sr.nextInt();
            for (int i = hight; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            case 0:
                System.out.println(0);
                break;
            default:
                System.out.println("yêu cầu sai");
        }

    }
}


