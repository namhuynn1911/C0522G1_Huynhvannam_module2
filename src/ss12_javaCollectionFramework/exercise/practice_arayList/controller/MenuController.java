package ss12_javaCollectionFramework.exercise.practice_arayList.controller;

import ss12_javaCollectionFramework.exercise.practice_arayList.service.IProductService;
import ss12_javaCollectionFramework.exercise.practice_arayList.service.impl.ProductService;

import java.util.Scanner;

public class MenuController {
    public static void menuController() {
        IProductService iProductService = new ProductService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo id \n" +
                    "3. Xóa sản phẩm theo id \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên \n" +
                    "6. Sắp xếp sản phẩm tăng dần ,giảm dần theo giá \n" +
                    "7. Thoát khỏi menu");

            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.findProduct();
                    break;
                case 6:
                    SortController.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
