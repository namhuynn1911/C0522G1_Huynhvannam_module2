package ss14_sort.practice.selectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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

        selectionSort(array);
        System.out.println("mảng vừa sắp xếp là \n" + Arrays.toString(array));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
        }
    }
}
