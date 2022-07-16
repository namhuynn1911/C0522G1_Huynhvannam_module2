package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import java.util.Scanner;

public class MainController {
    public static void danhSanhXe() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG==== \n" +
                    "Chọn chức năng \n" +
                    "1. Thêm mới phương tiện \n" +
                    "2. Hiện thị phương tiện \n" +
                    "3. Xóa phương tiện \n" +
                    "4. Tiềm kiếm theo biển kiểm soát \n" +
                    "5. Thoát");
            int bienSoSanh = Integer.parseInt(sc.nextLine());
            switch (bienSoSanh) {
                case 1:
                    AddController.themXe();
                    break;
                case 2:
                    DisPlayController.hienThi();
                    break;
                case 3:
                    RemoveController.xoaXe();
                    break;
                case 4:
                    FindController.timKiem();
                    break;
                case 5:
                    System.exit(0);
            }

        } while (true);
    }

}
