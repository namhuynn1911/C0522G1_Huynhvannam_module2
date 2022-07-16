package ss11_dsaStackQueue.exercise.digitalConversion.model;

import java.util.Scanner;
import java.util.Stack;

public class Conversion {
    private static Scanner sc=new Scanner(System.in);

    public static void decimalToBinary() {
        Stack<Integer> integerStack=new Stack<>();
        System.out.println("nhập vào một số thập phân bất kì: ");
        int decimal= Integer.parseInt(sc.nextLine());

        while (decimal>0) {
            integerStack.push(decimal%2);
            decimal/=2;
        }
        System.out.println("dãy nhị phân vừa được chuyển là: ");
        while (!integerStack.empty()) {
            System.out.print(integerStack.pop());
        }
    }
    public static void binaryToDecimal() {

    }
}
