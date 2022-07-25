package ss17_binary_file.exercise.product_management.service.impl;

import ss17_binary_file.exercise.product_management.model.ProductManagement;
import ss17_binary_file.exercise.product_management.service.IProductService;
import ss17_binary_file.exercise.product_management.utils.DuplicateIDException;
import ss17_binary_file.exercise.product_management.utils.ReadProduct;
import ss17_binary_file.exercise.product_management.utils.WriteReadProductFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final String PATH = "src/ss17_binary_file/exercise/product_management/data/product.csv";
    static List<ProductManagement> productList = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    public void writeFile() {
        WriteReadProductFile.writeToFile(PATH, productList);
    }

    public void readFile() {
        List<ProductManagement> list = ReadProduct.readFile(PATH);
        productList.clear();
        productList.addAll(list);
    }

    public void productAdd() {
        int id = 0;
        int price = 0;
        try {
            System.out.println("nhập vào id");
            id = Integer.parseInt(SCANNER.nextLine());
            for (ProductManagement productManagement : productList) {
                if ((productManagement.getId() == id)) {
                    throw new DuplicateIDException("id đã trùng yêu cầu nhập id mới");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("id là số nguyên yêu cầu nhập lại");
        } catch (DuplicateIDException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("nhập vào tên sản phẩm");
        String name = SCANNER.nextLine();

        System.out.println("nhập vào nhà sản xuất");
        String manufacturer = SCANNER.nextLine();

        try {
            System.out.println("nhập vào gái sản phẩm");
            price = Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("yêu cầu nhập lại số tiền");
        }

        System.out.println("nhập vào mô phỏng");
        String describe = SCANNER.nextLine();

        ProductManagement product = new ProductManagement(id, name, manufacturer, price, describe);
        productList.add(product);
        writeFile();
    }

    @Override
    public void display() {
        readFile();
        for (ProductManagement productManagement : productList) {
            System.out.println(productManagement);
        }
    }

    @Override
    public void findProduct() {
        readFile();
        System.out.println("bạn nhập vào tên sản phẩm");
        String nameFind = SCANNER.nextLine();
        boolean flag = false;
        for (ProductManagement productManagement : productList) {
            if (nameFind.equals(productManagement.getName())) {
                System.out.println(productManagement);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("khôn g tìm thấy tên sản phẩm");
        }
    }

}



