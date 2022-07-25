package ss9_DSA_DanhSach.exercise.CarMVC.mvc.view;


import ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller.MainController;

import java.io.IOException;

public class view {
    public static void main(String[] args) {
        try {
            MainController.danhSanhXe();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
