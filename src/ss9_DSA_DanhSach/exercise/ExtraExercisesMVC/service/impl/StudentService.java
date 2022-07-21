package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.DuplicateIDException;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        studentList.add(new Student(1, "huỳnh văn nam", "19/11/1993", "nam", "c05", 9));
        studentList.add(new Student(2, "đặng ngọc huy", "19/11/1998", "nam", "c05", 8));
        studentList.add(new Student(3, "phan xuân phúc", "19/11/1964", "nam", "c05", 1));
        studentList.add(new Student(4, "nguyễn tấn dũng", "19/11/1966", "nam", "c05", 2));
    }

    @Override
    public void addStudent(){
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

    @Override
    public void findStudent() {
        int choose;
        boolean isFlag = false;
        do {
            System.out.println("nhập vào số cần tìm kiếm \n" +
                    "1.Theo id \n" +
                    "2. Theo tên");
            choose = Integer.parseInt(sc.nextLine());
            if (choose != 1 && choose != 2) {
                System.out.println("yêu cầu nhập lại:");
            }

        } while (choose != 1 && choose != 2);

        if (choose == 1) {
            System.out.println("nhập vào id cần tìm kiếm:");
            int idFind = Integer.parseInt(sc.nextLine());
            for (Student student : studentList) {
                if (student.getId() == idFind) {
                    System.out.println(student);
                    isFlag = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String nameFind = sc.nextLine();
            for (Student student : studentList) {
                if (student.getName().contains(nameFind)) {
                    System.out.println(student);
                    isFlag = true;
                }
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void bubbleSort() {
        boolean nextTip = true;
        for (int i = 0; i < studentList.size() - 1 && nextTip; i++) {
            nextTip = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    nextTip = true;
                }
            }
        }

    }



    /**
     * phương thức cho người dùng nhập thông tin học sinh vào
     */
    public static Student infoStudent() {
        int id=0;
        double point=0;
        while (true) {
            try {

                System.out.print("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
                for (Student student:studentList ) {
                    if (student.getId() == id) {
                        throw new DuplicateIDException("id đã trùng,yêu cầu nhập lại");
                    }
                }
                break;
            }catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số nguyên,yêu cầu nhập lại");
            }catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập tên lớp: ");
        String classes = sc.nextLine();
        while (true) {
            try {
                System.out.print("nhập điểm: ");
                point = Double.parseDouble(sc.nextLine());
                break;
            }catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số thực,yêu cầu nhập lại");
            }
        }

        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        return student;
    }
}
