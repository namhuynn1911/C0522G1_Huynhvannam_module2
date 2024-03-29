package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.controller;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() throws IOException {
        do {
            System.out.println("Quản lý giảng viên \n" +
                    "1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên theo id \n" +
                    "3. Hiển thị danh sách giảng viên \n" +
                    "4. Tìm giảng viên theo id \n" +
                    "5. Sắp xếp theo họ và tên \n" +
                    "6. Quay lại chức năng chính");
            int choose = 0;
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("yêu cầu nhập số");
            }
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.remoTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    iTeacherService.findTeacher();
                    break;
                case 5:
                    iTeacherService.bubbleSort();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

}
