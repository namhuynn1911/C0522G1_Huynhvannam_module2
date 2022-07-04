package ss3_array.exercise;

import java.util.Scanner;

public class DeleteElementArr {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.printf("nhập vào một sô","");
        int number=sr.nextInt();
        int array[]={1,2,3,4,5};
        boolean [] deleteItem = new boolean[array.length];
        int size=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                deleteItem[i]=true;
            }
            else{
                deleteItem[i]=false;
                size++;
            }
        }
        String[] newArr=new String[size];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(!deleteItem[i]){
              //  newArr[index++]=array[i];
            }
        }
    }
}
