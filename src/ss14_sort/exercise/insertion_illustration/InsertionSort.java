package ss14_sort.exercise.insertion_illustration;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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

        insertionSort(array);

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("lấy ra giá trị " + arr[i]);
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                System.out.println(arr[j] + " > " + key);
                System.out.println("hoán đổi vị trí " + arr[j + 1] + " cho " + arr[j]);
                arr[j + 1] = arr[j];
            }
            //   System.out.println(arr[j] + " < " + key + " giữ nguyên");
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
