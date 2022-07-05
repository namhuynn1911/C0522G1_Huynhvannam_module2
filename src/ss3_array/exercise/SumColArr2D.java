package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumColArr2D {
    public static void main(String[] args) {
        int row, col;
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số hàng");
        row = sr.nextInt();
        System.out.println("nhập vào số cột");
        col = sr.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập vào phần tử arr[%d][%d]", i, j);
                arr[i][j] = sr.nextInt();
            }
        }
        int sumCol;
        do {
            System.out.println("nhập vào số cột cần tính tổng");
            sumCol = sr.nextInt();
            if (sumCol < 0 || sumCol > col) {
                System.out.print("không có cột này yêu cầu nhập lại");
            }
        } while (sumCol < 0 || sumCol > col);
        System.out.println(sum(arr, sumCol));
    }

    public static int sum(int array[][], int number) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (j == number) {
                    result += array[i][j];

                }
            }
            System.out.println();
        }
        return result;
    }
}