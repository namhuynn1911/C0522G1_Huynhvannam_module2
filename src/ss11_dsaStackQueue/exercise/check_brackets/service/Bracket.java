package ss11_dsaStackQueue.exercise.check_brackets.service;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào chuỗi ngẫu nhiên");
        String str=sc.nextLine();
        if (Bracket.checkBracket(str)) {
            System.out.println("tốt");
        }else {
            System.out.println("xấu");
        }
    }


    public static boolean checkBracket(String str) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                characterStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (characterStack.isEmpty()) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }

}

