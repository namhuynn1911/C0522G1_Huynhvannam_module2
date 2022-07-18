package ss11_dsaStackQueue.exercise.treeMap_count;

import java.util.Scanner;
import java.util.Map;

public class TreeMap {
    public static void count() {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new java.util.TreeMap<>();

        System.out.println("nhập vào một chuỗi ngẫu nhiên: ");
        String input = sc.nextLine();
        String[] array = input.trim().toLowerCase().split(" ");

        for (String key : array) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int count = map.get(key);
                map.put(key, count + 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s-%d \n", entry.getKey(), entry.getValue());
        }

    }

    public static void main(String[] args) {
        TreeMap.count();
    }
}

