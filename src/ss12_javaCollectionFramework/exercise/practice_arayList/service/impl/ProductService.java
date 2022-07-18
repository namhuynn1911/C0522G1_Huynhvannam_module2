package ss12_javaCollectionFramework.exercise.practice_arayList.service.impl;

import ss12_javaCollectionFramework.exercise.practice_arayList.model.Product;
import ss12_javaCollectionFramework.exercise.practice_arayList.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final List<Product> productList = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("nhập vào sản phẩm thành công");
    }

    @Override
    public void removeProduct() {
        System.out.println("nhập vào id cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getId() == idRemove) {
                System.out.printf("bán có muốn xóa %d \n" +
                        "1. Có \n" +
                        "2. Khômng", product.getId());
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xóa thành công");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy id này");
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("nhập vào tên sản phẩm cần tìm: ");
        String isFind = sc.nextLine();
        boolean check = false;

        for (Product product : productList) {
            if (product.getName().equals(isFind)) {
                System.out.println(product);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy tên sản phẩm:");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("nhập vào id cần chỉnh sửa: ");
        int isEdit = Integer.parseInt(sc.nextLine());

        for (Product product : productList) {
            if (isEdit == product.getId()) {
                System.out.print("nhập vào tên cần sửa: ");
                product.setName(sc.nextLine());
                System.out.print("nhập vào giá sản phẩm cần thay đổi");
                product.setPrice(Integer.parseInt(sc.nextLine()));
            }
        }
    }

    @Override
    public void sortAscending() {
        AscendingService comparatorAscending = new AscendingService();
        productList.sort(comparatorAscending);
    }

    @Override
    public void sortDecrease() {
        DecreaseService comparatorDecrease = new DecreaseService();
        productList.sort(comparatorDecrease);
    }


    /**
     * phương thức cho người dùng nhập vào sản phẩm
     */
    public static Product infoProduct() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("nhập vào giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
