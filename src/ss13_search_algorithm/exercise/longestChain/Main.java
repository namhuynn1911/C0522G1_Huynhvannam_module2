package ss13_search_algorithm.exercise.longestChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi: ");
        String str = sc.nextLine();

        List<Character> maxList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) > characterList.get(characterList.size() - 1)) {
                    characterList.add(str.charAt(j));
                }
            }
            if (characterList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(characterList);
            }
            characterList.clear();
        }
        System.out.println("chuỗi tăng dần có độ dài là: ");
        for (Character character : maxList) {
            System.out.print(character);
        }

    }

}
