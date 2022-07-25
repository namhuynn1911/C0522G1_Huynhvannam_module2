package ss17_binary_file.exercise.product_management.view;


import ss17_binary_file.exercise.product_management.controller.MenuController;
import ss17_binary_file.exercise.product_management.utils.DuplicateIDException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            MenuController.menuController();
        } catch (IOException | ClassNotFoundException | DuplicateIDException e) {
            e.printStackTrace();
        }
    }
}
