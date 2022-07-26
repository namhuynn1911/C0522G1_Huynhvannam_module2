package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.DuplicateIDException;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.IStudentService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.WriteFileUtil;

import java.io.IOException;

import java.util.*;

public class StudentService implements IStudentService {
    private static final String PATH = "src/ss9_DSA_DanhSach/exercise/ExtraExercisesMVC/file/student.csv";
    private static final String REGEX = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/]" +
            "(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-/]02)[-/][0-9]{4}|29[-/]02" +
            "[-/]([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468]" +
            "[048]|0[0-9]|1[0-6])00))$";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void addStudent() throws IOException {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        Student student = infoStudent();
        studentList.add(student);
        WriteFileUtil.writeStudentFile(PATH, studentList);
        System.out.println("thêm mới thành công");
    }

    /**
     * phương thức xóa học sinh khỏi danh sách.
     */
    @Override
    public void removeStudent() throws IOException {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(SCANNER.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    WriteFileUtil.writeStudentFile(PATH, studentList);
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
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void findStudent() throws IOException {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        int choose;
        boolean isFlag = false;
        do {
            System.out.println("nhập vào số cần tìm kiếm \n" +
                    "1.Theo id \n" +
                    "2. Theo tên");
            choose = Integer.parseInt(SCANNER.nextLine());
            if (choose != 1 && choose != 2) {
                System.out.println("yêu cầu nhập lại:");
            }

        } while (choose != 1 && choose != 2);

        if (choose == 1) {
            System.out.println("nhập vào id cần tìm kiếm:");
            int idFind = Integer.parseInt(SCANNER.nextLine());
            for (Student student : studentList) {
                if (student.getId() == idFind) {
                    System.out.println(student);
                    isFlag = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String nameFind = SCANNER.nextLine();
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
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
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
        WriteFileUtil.writeStudentFile(PATH, studentList);
    }

    public static String formatName() {
        System.out.print("Nhập name: ");
        String name = SCANNER.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }


    /**
     * phương thức cho người dùng nhập thông tin học sinh vào
     * /*
     */
    public static Student infoStudent() throws IOException {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        int id;
        double point;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(SCANNER.nextLine());
                for (Student student : studentList) {
                    if (student.getId() == id) {
                        throw new DuplicateIDException("id đã trùng,yêu cầu nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số nguyên,yêu cầu nhập lại");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
         //chỉnh sửa lại tên
        String name = formatName();

        String dayOfBirth;
        do {
            System.out.print("Nhập ngày sinh: ");
            dayOfBirth = SCANNER.nextLine();
            if (dayOfBirth.matches(REGEX)) {
                System.out.println("Ngày sinh hợp lệ ");
                break;
            } else {
                System.out.println("Nhập sai nhập lại");
            }
        } while (true);

        System.out.print("giới tính: ");
        String gender = SCANNER.nextLine();

        System.out.println("nhập tên lớp: ");
        String classes = SCANNER.nextLine();

        while (true) {
            try {
                System.out.print("nhập điểm: ");
                point = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số thực,yêu cầu nhập lại");
            }
        }
        Student student = new Student(id, name, dayOfBirth, gender, classes, point);
        return student;
    }
}
