package ss17_binary_file.exercise.product_management.utils;

import ss17_binary_file.exercise.product_management.model.ProductManagement;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadProduct {
    public static List<ProductManagement> readFile(String path){
        List<ProductManagement> products = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<ProductManagement>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
