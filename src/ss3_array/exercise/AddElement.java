package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int index;
        int n;

        //nhập vào length
        do {
            System.out.println("Nhập vào chiều dài mảng: ");
            n = sr.nextInt();
        } while (n < 0);
        int[] arr = new int[n];
        //nhập vào phần tử cho mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhập vào giá trị cho mảng %d:", i);
            arr[i] = sr.nextInt();
        }
        //in mảng vừa nhập
        System.out.println(Arrays.toString(arr));
        boolean conditionLeng;

        //nhập vị trí cần chèn
        do {
            System.out.println("Nhập vào vị trí cần chèn: ");
            index = sr.nextInt();
            conditionLeng = (index <= -1 || index >= arr.length);
            if (conditionLeng) {
                System.out.println("yêu cầu nhập lại");
            }
        } while (conditionLeng);

        //nhập vào số càn chèn
        System.out.println("nhập vào số cần chèn");
        int number = sr.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int k = 0; k < index; k++) {
            newArr[k] = arr[k];
        }
        newArr[index] = number;
        for (int h = index + 1; h < newArr.length; h++) {
            newArr[h] = arr[h - 1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}


