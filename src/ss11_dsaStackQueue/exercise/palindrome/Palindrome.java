package ss11_dsaStackQueue.exercise.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        Queue<Character> characterQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("nhập vào chuỗi kí tự");
        String input = sc.nextLine();
        String str = input.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            characterQueue.add(str.charAt(i));
            characterStack.push(str.charAt(i));
        }
        System.out.println(characterStack);


        boolean check = false;
        for (int i = 0; i < characterQueue.size(); i++) {
            if (characterQueue.poll() != characterStack.pop()) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("không phải Palindrome");
        } else {
            System.out.println("là Palindrome");
        }
    }
}

