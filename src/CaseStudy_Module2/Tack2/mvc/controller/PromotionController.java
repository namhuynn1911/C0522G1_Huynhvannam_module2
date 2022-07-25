package CaseStudy_Module2.Tack2.mvc.controller;

import java.util.Scanner;

public class PromotionController {
    public static void menuPromotion() {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("===QUẢN LÝ KHUYẾN MÃI=== \n" +
                    "1. Hiển thị danh sách khách hàng sử dụng dịch vụ \n" +
                    "2. Hiển thị danh sách khách hàng nhận được voucher \n" +
                    "3. Trở lại menu chính ");
            int choose= Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    return;
            }

        }while (true);

    }
}
