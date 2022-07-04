package ss2_loop.exercise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số lượng số nguyên tố");
        int number = sr.nextInt();
        int count = 0;
        int prime = 2;
        while (count < number) {
            int divisor = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(prime + "\n");
                count++;
            }
            prime++;
        }

    }
}
