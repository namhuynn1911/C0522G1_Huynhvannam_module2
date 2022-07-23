package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.view;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.controller.MainController;

import java.io.IOException;

public class View {
    public static void main(String[] args)  {
        try {
            MainController.menuController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
