package ss11_dsaStackQueue.exercise.check_brackets.model;

import java.util.Stack;

public class Bracket {
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

