package CaseStudy_Module2.Tack2.mvc.controller;

import java.util.Scanner;

public class CustomerController {
    public static void menuCustomer() {
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("===QUẢN LÝ KHÁCH HÀNG=== \n" +
                    "1. Hiển thị danh sách khách hàng \n" +
                    "2. Thêm khách hàng mới \n" +
                    "3. Chỉnh sửa khách hàng \n" +
                    "4. Trở lại menu chính ");
            int choose= Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }while (true);
    }
}
