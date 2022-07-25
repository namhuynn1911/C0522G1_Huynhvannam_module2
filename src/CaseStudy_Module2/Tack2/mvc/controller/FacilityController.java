package CaseStudy_Module2.Tack2.mvc.controller;

import java.util.Scanner;

public class FacilityController {
    public static void menuFacility() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===QUẢN LÝ CƠ SỞ HẠ TẦNG===\n" +
                    "1 Cơ sở danh sách hiển thị \n" +
                    "2 Thêm cơ sở mới \n" +
                    "3 Hiển thị danh sách bảo trì cơ sở \n" +
                    "4 Trở lại menu chính ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }

        } while (true);

    }
}
