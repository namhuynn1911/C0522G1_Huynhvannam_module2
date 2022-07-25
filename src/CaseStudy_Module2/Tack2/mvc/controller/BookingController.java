package CaseStudy_Module2.Tack2.mvc.controller;

import java.util.Scanner;

public class BookingController {
    public static void menBooking() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===QUẢN LÝ ĐẶT PHÒNG===\n" +
                    "1. Thêm đặt chỗ mới \n" +
                    "2. Hiển thị danh sách đặt chỗ \n" +
                    "3. Tạo các co thắt mới \n" +
                    "4. Hiển thị hợp đồng danh sách \n" +
                    "5. Chỉnh sửa hợp đồng \n" +
                    "6. Trở lại menu chính ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return;
            }
        } while (true);
    }
}
