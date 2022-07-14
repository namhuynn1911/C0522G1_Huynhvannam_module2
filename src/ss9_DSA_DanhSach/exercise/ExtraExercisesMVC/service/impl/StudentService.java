package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("thêm mới thành công");
    }

    /**
     * phương thức xóa học sinh khỏi danh sách.
     */
    @Override
    public void removeStudent() {
        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
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
     * phương thức hiển thị học sinh
     */
    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


    /**
     * phương thức cho người dùng nhập thông tin học sinh vào
     *
     * @return
     */
    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập tên lớp: ");
        String classes = sc.nextLine();
        System.out.print("nhập điểm: ");
        double point = Double.parseDouble(sc.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        return student;
    }
}
