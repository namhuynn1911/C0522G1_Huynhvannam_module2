package ss14_sort.practice;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
       int[] arr={-1,150,190,170,-1,-1,160,180};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==-1||arr[j]==-1){
                    continue;
                }else {
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        return arr;
    }
}
