package ss3_array.exercise;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.println("nhập vào một chuỗi");
        String str=sr.nextLine();
        System.out.println("nhập vào kí tự để đếm");
        char character =sr.nextLine().charAt(0);
        int count=0;

        for(int i=0;i<str.length();i++) {
            if(character==str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("số lượng kí tự trùng nhau %d ",count);
    }
}
