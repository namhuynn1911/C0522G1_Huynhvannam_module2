package ss11_dsaStackQueue.exercise.reverseArray.model;


import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    private static Scanner sc = new Scanner(System.in);


    /**
     * phương thức đảo ngược mảng số nguyên
     */
    public static void isInteger() {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("nhập độ dài stack :");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.printf("nhập vào phần tử [%d] cho stack :", i);
            integerStack.push(sc.nextInt());
        }
        System.out.println("mảng ban đầu: "+integerStack);

        Stack<Integer> newStack = new Stack<>();
        while (!integerStack.isEmpty()) {
            newStack.push(integerStack.pop());
        }
        for (int element : newStack) {
            integerStack.push(element);

        }
        System.out.println("mảng đảo ngược: "+integerStack);

    }

    /**
     * phương thức đão ngược chuỗi
     */
    public static void isString() {
        Stack<Character> characterStack = new Stack<>();
        System.out.println("nhập vào chuỗi cần đảo ngược");
        String input = sc.nextLine();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            characterStack.push(ch);
        }
        System.out.println("chuỗi ban đầu: "+characterStack);

        Stack<Character> newChaStack = new Stack<>();
        while (!characterStack.isEmpty()) {
            newChaStack.push(characterStack.pop());
        }
        for (Character temp : newChaStack) {
            characterStack.push(temp);

        }
        System.out.println("mảng chuỗi đảo ngược: "+characterStack);
    }

}

