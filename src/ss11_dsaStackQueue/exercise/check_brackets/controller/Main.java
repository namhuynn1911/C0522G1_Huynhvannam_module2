package ss11_dsaStackQueue.exercise.check_brackets.controller;

import ss11_dsaStackQueue.exercise.check_brackets.model.Bracket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào chuỗi ngẫu nhiên");
        String str=sc.nextLine();
       boolean result= Bracket.checkBracket(str);
        System.out.println(result);
    }
}
