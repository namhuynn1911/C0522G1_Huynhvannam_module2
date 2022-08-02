package ss17_binary_file.lamthem.mvc_phone.controller;

import java.util.Scanner;

public class QuanLyDienThoaiController {
    private static final Scanner SCANNER=new Scanner(System.in);
    public static void quanLyController() {
        do {
            int bienSoSanh;
            while (true) {
                try {
                    System.out.println("===CHUWONGTRINH QUẢN LÝ ĐIỆN THOẠI===\n" +
                            "1. Quản lý điện thoại chính hãng\n" +
                            "2. Quản lý điện xách tay\n" +
                            "3. Thoát chương trình");
                    bienSoSanh= Integer.parseInt(SCANNER.nextLine());
                    break;
                }catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (bienSoSanh){
                case 1:
                    DienThoaiChinhHangController.dienThoaiChinhHangController();
                    break;
                case 2:
                    DienThoaiXachTayController.dienThoaiXachTayContronller();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("bạn nhập sai yêu cầu nhập lại");
            }
        }while (true);
    }
    }

