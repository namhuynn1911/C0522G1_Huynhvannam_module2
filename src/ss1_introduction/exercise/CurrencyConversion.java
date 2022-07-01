package ss1_introduction.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double usd;
        Scanner sr = new Scanner(System.in);
        System.out.print("nhập vào số tiền USD");
        usd = sr.nextDouble();

        double currency = usd * 23000;
        System.out.printf("giá trị VND  %.1f", currency);
    }
}
