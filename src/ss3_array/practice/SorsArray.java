package ss3_array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SorsArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        //nhập độ dài của mảng không quá 20 phần tử
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        //nhập các phần tử cho mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        //In kết quả mảng sau khi sắp xếp giảm dần
        System.out.println(Arrays.toString(array));

        //Sắp xếp mảng ban đầu theo thứ tự tăng dần
    }
}
