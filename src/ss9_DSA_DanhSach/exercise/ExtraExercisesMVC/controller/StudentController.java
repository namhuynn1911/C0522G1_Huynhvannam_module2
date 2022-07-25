package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.controller;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.IStudentService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl.StudentService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() throws IOException {
        do {
            System.out.println("Quản lý học sinh\n" +
                    "1. Thêm học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Hiển thị danh sách học sinh \n" +
                    "4. Tìm kiếm theo id hoặc theo tên \n" +
                    "5. Sắp xếp theo tên \n" +
                    "6. Quay lại chức năng chính");
            int choose = 0;
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("yêu cầu nhập số");
            }
            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:

                    iStudentService.findStudent();
                    break;
                case 5:
                    iStudentService.bubbleSort();
                    break;
                case 6:
                    return;
            }
        } while (true);

    }
}
