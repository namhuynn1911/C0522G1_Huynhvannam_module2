package ss17_binary_file.lamthem.mvc_phone.controller;

import ss17_binary_file.lamthem.mvc_phone.service.IDienThoaiService;
import ss17_binary_file.lamthem.mvc_phone.service.impl.DienThoaiChinhHangService;

import java.util.Scanner;

public class DienThoaiChinhHangController {
    private static IDienThoaiService iDienThoaiService=new DienThoaiChinhHangService();
    private static final Scanner SCANNER=new Scanner(System.in);
    public static void dienThoaiChinhHangController(){
        do {
            int bienSoSanh;
            while (true) {
                try {
                    System.out.println("===ĐIỆN THOẠI CHÍNH HÃNG===\n" +
                            "1. Thêm mới\n" +
                            "2. Xóa\n" +
                            "3. Xem danh sách\n" +
                            "4. Tìm kiếm\n" +
                            "5. Thoát");
                    bienSoSanh = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (bienSoSanh) {
                case 1:
                    iDienThoaiService.add();
                    break;
                case 2:
                    iDienThoaiService.remove();
                    break;
                case 3:
                    iDienThoaiService.display();
                    break;
                case 4:
                    iDienThoaiService.find();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
