package ss2_loop.practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số ngẫu nhiên");
        int number = sr.nextInt();
        if (number < 2) {
            System.out.println(number + "is not prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + "is a prime");
            } else {
                System.out.println(number + "is not a prime");
            }
        }
    }
}
