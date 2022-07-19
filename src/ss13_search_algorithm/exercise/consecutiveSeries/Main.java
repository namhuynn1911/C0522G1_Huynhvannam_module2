package ss13_search_algorithm.exercise.consecutiveSeries;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi ngẫu nhiên: ");
        String str = sc.nextLine();
        List<Character> maxList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();

        characterList.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i - 1)) {
                characterList.clear();
            }

            characterList.add(str.charAt(i));

            if (characterList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(characterList);
            }
        }

        System.out.println("Chuỗi liên tiếp có độ dài lớn nhất: ");
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}

