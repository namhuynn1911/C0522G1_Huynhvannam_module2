package ss2_loop.practice;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int number;

        do {
            System.out.println("nhập vào một số ngẫu nhiên");
            number = sr.nextInt();
            if (number < 0) {
                System.out.println("số lớn hơn 0.yêu cầu nhập lại");
            }
        } while (number < 0);

        if (isPrime(number)) {
            System.out.printf("%d là số nguyên tố", number);
        } else {
            System.out.printf("%d không phải là số nguyên tố", number);
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
