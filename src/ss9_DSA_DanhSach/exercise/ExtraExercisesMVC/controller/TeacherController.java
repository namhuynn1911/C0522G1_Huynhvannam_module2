package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.controller;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("Quản lý giảng viên \n" +
                    "1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên theo id \n" +
                    "3. Hiển thị danh sách giảng viên \n" +
                    "4.quay lại chức năng chính");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.remoTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                case 4:
                    return;
            }
        } while (true);
    }

}
