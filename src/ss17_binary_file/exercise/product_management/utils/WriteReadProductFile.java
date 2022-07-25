package ss17_binary_file.exercise.product_management.utils;

import ss17_binary_file.exercise.product_management.model.ProductManagement;

import java.io.*;
import java.util.List;

public class WriteReadProductFile {
    public static void writeToFile(String path, List<ProductManagement> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);
            object.writeObject(products);
            object.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
