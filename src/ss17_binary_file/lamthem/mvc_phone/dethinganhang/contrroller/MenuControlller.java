package ss17_binary_file.lamthem.mvc_phone.dethinganhang.contrroller;

import java.util.Scanner;

public class MenuControlller {
        private static final Scanner SCANNER=new Scanner(System.in);
    public static void menuControler() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("===CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGHÂN HÀNG===\n" +
                            "Chọn chức năng theo số (để tiếp tục)\n" +
                            "1.Quản lý tài khoản tiết kiệm\n" +
                            "2.Quản lý tài khoản thanh toán\n" +
                            "3. Thoát");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                }catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }
            switch (choose) {
                case 1:
                    SavingContoller.menuSavingController();
                    break;
                case 2:
                    PaymentController.menuPaymentController();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
