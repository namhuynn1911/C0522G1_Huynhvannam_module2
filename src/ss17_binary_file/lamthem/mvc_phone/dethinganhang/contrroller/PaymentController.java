package ss17_binary_file.lamthem.mvc_phone.dethinganhang.contrroller;

import java.util.Scanner;

public class PaymentController {
    private static final Scanner SCANNER=new Scanner(System.in);
    public static void menuPaymentController() {
        do {
            System.out.println("===QUẢNG LÝ TÀI KHOẢN THANH TOÁN===\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách tài khoản thanh toán\n" +
                    "4. Tìm kiếm\n" +
                    "5. Quya về menu chính");
            int choose=0;
            try {
                choose= Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("nhập vào số");
            }
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return;
            }
        }while (true);
    }
}
