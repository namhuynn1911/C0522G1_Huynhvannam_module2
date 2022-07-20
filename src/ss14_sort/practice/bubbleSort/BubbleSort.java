package ss14_sort.practice.bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhập vào phần tử [%d] ", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));

      bubbleSort(array);
        System.out.println("mảng vừa sắp xếp \n"+Arrays.toString(array));
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length-1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }

    }
}
