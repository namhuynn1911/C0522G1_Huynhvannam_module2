package CaseStudy_Module2.Tack2.mvc.controller;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu()  {
        Scanner scanner = new Scanner(System.in);
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("====MENU LỰA CHỌN CHỨC NĂNG=======\n" +
                            "1. Quản lý nhân viên \n" +
                            "2. Quản lý khách hàng \n" +
                            "3. Quản lý Cơ sở \n" +
                            "4. Quản lý đặt phòng \n" +
                            "5. Quản lý Khuyến mãi \n" +
                            "6. Thoát ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }
            switch (choose) {
                case 1:
                        EmployeeController.menuEmployee();
                    break;
                case 2:
                        CustomerController.menuCustomer();
                   break;
                case 3:
                    FacilityController.menuFacility();
                    break;
                case 4:
                    BookingController.menBooking();
                    break;
                case 5:
                    PromotionController.menuPromotion();
                    break;
                case 6:
                    System.exit(0);
            }

        } while (true);


    }
}
