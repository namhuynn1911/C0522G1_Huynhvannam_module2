package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.controller;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public static void menuController() throws IOException {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN \n" +
                    "Chọn chức năng theo số (tiếp tục) \n" +
                    "1. Quản lý học sinh \n" +
                    "2.Quản lý giảng viên \n" +
                    "3. Thoát");
            System.out.println("nhập vào lựa chọn");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
            }

        } while (true);

    }
}
