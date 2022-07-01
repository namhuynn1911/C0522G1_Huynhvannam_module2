package ss1_introduction.exercise;

import java.util.Scanner;

public class ShowName {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("nhập vào tên");
        String fullName = sr.nextLine();

        System.out.printf("Hello : %s", fullName);
    }
}
