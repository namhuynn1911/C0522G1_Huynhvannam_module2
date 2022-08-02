package ss17_binary_file.lamthem.mvc_phone.dethinganhang.contrroller;

import ss17_binary_file.lamthem.mvc_phone.dethinganhang.service.IBankService;

import ss17_binary_file.lamthem.mvc_phone.dethinganhang.service.impl.SavingAccountService;

import java.util.Scanner;

public class SavingContoller {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static IBankService iBankService = new SavingAccountService();

    public static void menuSavingController() {
        do {
            System.out.println("==QUẢN LÝ TÀI KHOẢN TIẾT KIỆM===\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách tài khoản tiết kiệm\n" +
                    "4. Tìm kiếm theo tên\n" +
                    "5. Tìm kiếm theo mã ngân hàng\n" +
                    "6. Quya về menu chính");
            int choose = 0;
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập lại số");
            }
            switch (choose) {
                case 1:
                    iBankService.add();
                    break;
                case 2:
                    iBankService.remove();
                case 3:
                    iBankService.display();
                    break;
                case 4:
                    iBankService.find();
                    break;
                case 5:
                    iBankService.find();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
