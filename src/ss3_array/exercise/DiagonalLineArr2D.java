package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalLineArr2D {
    public static void main(String[] args) {
        int row;
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số hàng bằng số cột");
        row = sr.nextInt();
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("nhập vào phần tử arr[%d][%d]", i, j);
                arr[i][j] = sr.nextInt();
            }
        }
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
       int result1 = sum(arr);
        System.out.println(result1);
        int result2 = sumNew(arr);
        System.out.println(result2);
        System.out.println(result1 + result2);
    }

    //hàm tính đường chéo thuận
    public static int sum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
                sum += array[i][i];
        }
        return sum;
    }

    //hàm tính đường chéo ngược
    public static int sumNew(int[][] array) {
        int newSum = 0;
        for (int i = 0; i < array.length; i++) {
            newSum += array[i][array.length - 1 - i];
        }
        return newSum;
    }
}
