package ss13_search_algorithm.practice.binary_searchTH1;

import java.util.Scanner;

public class Binary {
    private static Scanner sc=new Scanner(System.in);

    public static int[] createArray() {
        int length= sc.nextInt();
        int[] array=new int[length];
        for (int i=0;i<array.length;i++) {
            System.out.printf("nhập vào giá trị [%d]: ",i);
            array[i]=sc.nextInt();
        }

        return array;
    }

   public static int binarySearch(int[] arr,int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arr[mid])
                high = mid - 1;
            else if (key == arr[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []  arrNumber=createArray();
        System.out.println(binarySearch(arrNumber, 2));  /* 0 */
        System.out.println(binarySearch(arrNumber, 11)); /* 4 */
        System.out.println(binarySearch(arrNumber, 79)); /*12 */
        System.out.println(binarySearch(arrNumber, 1));  /*-1 */
        System.out.println(binarySearch(arrNumber, 5));  /*-1 */
        System.out.println(binarySearch(arrNumber, 80)); /*-1 */
    }
}
