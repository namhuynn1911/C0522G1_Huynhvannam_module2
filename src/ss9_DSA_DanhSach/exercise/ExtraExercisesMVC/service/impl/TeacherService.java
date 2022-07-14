package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    /**
     * phương thức để thêm thành viên cho mảng dánh sách
     */
    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm giáo viên thành công:");

    }

    /**
     * phương thức xóa giảng viên
     */
    @Override
    public void remoTeacher() {
        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    /**
     * phương thức hiển thị danh sách giảng viên
     */
    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    /**
     * phương thức để cho người dùng nhập thông tin
     *
     * @return
     */
    public static Teacher infoTeacher() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập vào chuyên môn");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        return teacher;
    }
}
