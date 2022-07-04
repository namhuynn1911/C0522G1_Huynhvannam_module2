package ss2_loop.exercise;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        for (int prime = 2; prime <= 100; prime++) {
            int divisor = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(prime + "\n");
            }
        }

    }
}

