package CaseStudy_Module2.Tack2.mvc.controller;

import CaseStudy_Module2.Tack2.mvc.service.IFacilityService;
import CaseStudy_Module2.Tack2.mvc.service.impl.FacilityService;

import java.util.Scanner;

public class MenuAddFacility {

    static IFacilityService iFacilityService = new FacilityService();

    public static void menuAdd() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==THÊM CƠ SỞ HẠ TẦN==\n" +
                    "1.Thêm mới VILLA \n" +
                    "2.Thêm mới HOUSE \n" +
                    "3.Thêm mới ROOM \n" +
                    "4. Quay lại menu chính");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập lại số");
            }
            switch (choose) {
                case 1:
                    iFacilityService.addVilla();
                    break;
                case 2:
                    iFacilityService.addHouse();
                    break;
                case 3:
                    iFacilityService.addRom();
                case 4:
                    return;
                default:
                    System.out.println("bạn dã nhập sai yêu cầu nhập lại");
            }
        } while (true);


    }
}
