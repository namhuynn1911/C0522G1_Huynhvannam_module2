package CaseStudy_Module2.Tack2.mvc.controller;

import CaseStudy_Module2.Tack2.mvc.service.ICustomerService;
import CaseStudy_Module2.Tack2.mvc.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void menuCustomer() {
        ICustomerService iCustomerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===QUẢN LÝ KHÁCH HÀNG=== \n" +
                    "1. Hiển thị danh sách khách hàng \n" +
                    "2. Thêm khách hàng mới \n" +
                    "3. Chỉnh sửa khách hàng \n" +
                    "4. Trở lại menu chính ");
            int choose =0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }

            switch (choose) {
                case 1:
                    iCustomerService.displayCustomer();
                    break;
                case 2:
                    iCustomerService.addCustomer();
                    break;
                case 3:
                    iCustomerService.editCustomer();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
