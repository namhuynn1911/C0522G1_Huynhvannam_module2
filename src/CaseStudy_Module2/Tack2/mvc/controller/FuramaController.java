package CaseStudy_Module2.Tack2.mvc.controller;


import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("====MENU LỰA CHỌN CHỨC NĂNG=======\n" +
                    "1. Quản lý nhân viên \n" +
                    "2. Quản lý khách hàng \n" +
                    "3. Quản lý Cơ sở \n" +
                    "3. Quản lý đặt phòng \n" +
                    "5. Quản lý Khuyến mãi \n" +
                    "6. Thoát ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeController.menuEployee();
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
