package ss3_array.exercise;

import java.util.Scanner;

public class Arr2DMax {
    public static void main(String[] args) {
        int crow, col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        crow = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        col = scanner.nextInt();
        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] arr = new int[crow][col];
        for (int i = 0; i < crow; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.printf("số lớn nhất trong mảng là %d", max);

    }
}
