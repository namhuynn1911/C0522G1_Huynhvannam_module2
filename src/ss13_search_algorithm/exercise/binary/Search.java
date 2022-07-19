package ss13_search_algorithm.exercise.binary;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng: ");
        int lenth = Integer.parseInt(sc.nextLine());
        int[] arr = new int[lenth];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhập vào giá trị [%d]: ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("nhập vào giá trị cần tìm kiếm:");
        int value = Integer.parseInt(sc.nextLine());

        System.out.println("vị trí index cần tìm là: ");
        System.out.println(binarySearch(arr, 0, lenth - 1, value));
    }

    /**
     * phương thức tìm kiếm giá có tồn taị trọng mảng nếu có xuât ra vị trí trong mảng
     */
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > value) {
                return binarySearch(array, left, mid - 1, value);
            }
            return binarySearch(array, mid + 1, right, value);
        }
        return -1;
    }

}
