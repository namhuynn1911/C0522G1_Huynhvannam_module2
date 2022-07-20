package ss14_sort.exercise.ascending_insertion_sort;

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
        System.out.println("mảng được sắp xếp là :\n "+Arrays.toString(array));
    }

    public static void  insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++) {
            int key=arr[i];
            int j;
            for (j=i-1;j>=0 && arr[j]>key;j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1]=key;
        }
    }
}
