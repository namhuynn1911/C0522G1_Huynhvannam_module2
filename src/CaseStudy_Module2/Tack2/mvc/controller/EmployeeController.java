package CaseStudy_Module2.Tack2.mvc.controller;

import CaseStudy_Module2.Tack2.mvc.service.IEmployeeService;
import CaseStudy_Module2.Tack2.mvc.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void menuEmployee() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();

        do {
                    System.out.println("===QUẢN LÝ NHÂN VIÊN=== \n" +
                            "1 Hiển thị danh sách nhân viên \n" +
                            "2 Thêm nhân viên mới \n" +
                            "3 Chỉnh sửa nhân viên \n" +
                            "4 Trở lại menu chính ");
            int choose=0;
                    try {
                    choose = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            switch (choose) {
                case 1:
                    iEmployeeService.displayEployee();
                    break;
                case 2:
                    iEmployeeService.addEployee();
                    break;
                case 3:
                    iEmployeeService.editEmployee();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("bạn phải nhập đúng chức năng.yêu cầu nhập lại");
            }

        } while (true);
    }

}
