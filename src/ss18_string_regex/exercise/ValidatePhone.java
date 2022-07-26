package ss18_string_regex.exercise;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("nhập vào số điện thoại: ");
            String phoneNumber=scanner.nextLine();
            if (phoneNumber.matches("[(][0-9]{2}[)][-][(][0][0-9]{9}[)]")) {
                System.out.println("số điện thoại hợp lệ "+phoneNumber);
                break;
            }else {
                System.out.println("số điện thoại không hợp lệ");
            }
        }while (true);
    }
}
