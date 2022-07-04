package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] arrA = new int[5];
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("nhập vào phần tử arrA[%d]", i);
            arrA[i] = sr.nextInt();
        }
        int[] arrB = new int[4];
        for (int j = 0; j < arrB.length; j++) {
            System.out.printf("nhập vào phần tử arrB[%d]", j);
            arrB[j] = sr.nextInt();
        }
        int leng = arrA.length + arrB.length;
        int[] result = new int[leng];
       /* for(int k=0;k< arrA.length;k++) {
            result[k]=arrA[k];
        }
        for(int h = 0; h< arrB.length; h++) {
           result[h+ arrA.length]=arrB[h];
        }*/
        int count = 0;
        for (int elemnet : arrA) {
            result[count] = elemnet;
            count++;
        }
        for (int element : arrB) {
            result[count] = element;
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
