package CaseStudy_Module2.Tack2.mvc.utils;

import java.util.Scanner;

public class FormatName {
private static final Scanner SCANNER=new Scanner(System.in);
    public static String getName(String str1) {
        String[] arr = str1.toLowerCase().trim().split("");
        StringBuilder strNew = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    strNew.append(arr[i].toUpperCase());
                } else {
                    strNew.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                strNew.append(arr[i]);
            }
        }
        return strNew.toString();
    }
}
