package ss12_javaCollectionFramework.exercise.practice_arayList.controller;

import ss12_javaCollectionFramework.exercise.practice_arayList.service.IProductService;
import ss12_javaCollectionFramework.exercise.practice_arayList.service.impl.ProductService;

import java.util.Scanner;

public class SortController {
    public static void sort() {
        IProductService iProductService = new ProductService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("SẮP XẾP SẢN PHẨM THEO GIÁ \n" +
                    "1. Tăng dần \n" +
                    "2. Giảm dần \n" +
                    "3. Quay về menu chính");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    iProductService.sortAscending();
                    iProductService.displayProduct();
                    break;
                case 2:
                    iProductService.sortDecrease();
                    iProductService.displayProduct();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
