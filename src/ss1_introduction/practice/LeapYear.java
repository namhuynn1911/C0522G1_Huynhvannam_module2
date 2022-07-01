package ss1_introduction.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] ager) {
        Scanner sr =new Scanner(System.in);
        int year;
        int month;
        System.out.print("nhập vào số tháng");
        month = sr.nextInt();

        System.out.print("nhập vào số năm");
        year = sr.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("tháng %s ,%s có 31 ngày ",month,year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("tháng %d ,năm %d có 30 ngày ",month,year);
                break;
            case 2:
                if((year%4==0 &&year%100 !=0)||(year%400 ==0)) {
                    System.out.printf("%d là năm nhuận tháng %d có 29 ngày",year,month);
                } else {
                    System.out.printf("%d là năm không nhuận tháng %d có 28 ngày",year,month);
                }
        }
    }
}
/* switch (a) {
 case 1:
 case 3:
 case 5:
 case 7:
 case 8:
 case 10:
 case 12:
 document.write(a + " has 31 days");
 break;
 case 4:
 case 6:
 case 9:
 case 11:
 document.write(a + " has 30 days");
 break;
 case 2:
 if ((b % 4 === 0 && b % 100 !== 0) || b % 400 === 0) {
 document.write(a + " has 29 days" + "<br>");
 document.write("leap year");
 } else {
 document.write(a + " has 28 days" + "<br>");
 document.write("Not leap year");
 }
 break;
 }*/