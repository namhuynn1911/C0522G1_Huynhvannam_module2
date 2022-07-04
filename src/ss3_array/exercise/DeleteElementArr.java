package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArr {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int index = 0;
        int n;
        //nhập vào length
        do {
            System.out.println("Nhập vào chiều dài mảng: ");
            n = sr.nextInt();
        } while (n < 0);
        int[] array = new int[n];
        //nhập vào phần tử cho mảng
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhập vào giá trị cho mảng %d:", i);
            array[i] = sr.nextInt();
        }
        //in mảng vừa nhập
        System.out.println(Arrays.toString(array));
        //tim vị trí và xóa phần tử đó
        System.out.println("nhập vào số cần xóa");
        int number = sr.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        int size = array.length;
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        size--;
        System.out.println("sau khi xóa phần tử :");
        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + "\t");
        }
    }
}
