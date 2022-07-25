package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.DuplicateIDException;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.IStudentService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.WriteFileUtil;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final String PATH ="src/ss9_DSA_DanhSach/exercise/ExtraExercisesMVC/file/student.csv";
    private static List<Student> studentList=new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void writeStudent() throws IOException {
        WriteFileUtil.writeStudentFile(PATH,studentList);
    }
    public void readStudent() throws IOException {
        List<Student> list = ReadFileUtil.readStudentFile(PATH);
        studentList.clear();
        studentList.addAll(list);
    }
    @Override
    public void addStudent() throws IOException {
       readStudent();
       Student student=infoStudent();
       studentList.add(student);
        WriteFileUtil.writeStudentFile(PATH,studentList);
        System.out.println("thêm mới thành công");
    }

    /**
     * phương thức xóa học sinh khỏi danh sách.
     */
    @Override
    public void removeStudent() throws IOException {
        readStudent();
        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                   writeStudent();
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
    public void displayAllStudent() throws IOException {
        readStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void findStudent() throws IOException {
        readStudent();
        int choose;
        boolean isFlag = false;
        do {
            System.out.println("nhập vào số cần tìm kiếm \n" +
                    "1.Theo id \n" +
                    "2. Theo tên");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose != 1 && choose != 2) {
                System.out.println("yêu cầu nhập lại:");
            }

        } while (choose != 1 && choose != 2);

        if (choose == 1) {
            System.out.println("nhập vào id cần tìm kiếm:");
            int idFind = Integer.parseInt(scanner.nextLine());
            for (Student student : studentList) {
                if (student.getId() == idFind) {
                    System.out.println(student);
                    isFlag = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String nameFind = scanner.nextLine();
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
    public void bubbleSort() throws IOException {
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
        writeStudent();

    }


    /**
     * phương thức cho người dùng nhập thông tin học sinh vào
     /*  */
    public static Student infoStudent() throws IOException {
        int id=0;
        double point=0;
        while (true) {
            try {

                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Student student:studentList) {
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
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập tên lớp: ");
        String classes = scanner.nextLine();
        while (true) {
            try {
                System.out.print("nhập điểm: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số thực,yêu cầu nhập lại");
            }
        }

        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        return student;
    }
}
