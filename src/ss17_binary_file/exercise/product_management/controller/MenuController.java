package ss17_binary_file.exercise.product_management.controller;

import ss17_binary_file.exercise.product_management.service.IProductService;
import ss17_binary_file.exercise.product_management.service.impl.ProductService;
import ss17_binary_file.exercise.product_management.utils.DuplicateIDException;

import java.io.IOException;
import java.util.Scanner;

public class MenuController {
    private static Scanner scanner = new Scanner(System.in);
  static IProductService iProductService = new ProductService();

    public static void menuController() throws IOException, ClassNotFoundException, DuplicateIDException {
        do {
            System.out.println("==QUẢN LÝ SẢN PHẨM== \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiện thị sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm \n" +
                    "4. Thoát menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.productAdd();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.findProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
