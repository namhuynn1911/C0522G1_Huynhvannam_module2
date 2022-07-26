package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.DuplicateIDException;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.WriteFileUtil;

import java.io.IOException;
import java.util.*;

public class TeacherService implements ITeacherService {
    private static final String PATH = "src/ss9_DSA_DanhSach/exercise/ExtraExercisesMVC/file/teacher.csv";
    private static final String REGEX = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/]" +
            "(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-/]02)[-/][0-9]{4}|29[-/]02" +
            "[-/]([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468]" +
            "[048]|0[0-9]|1[0-6])00))$";
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * phương thức để thêm thành viên cho mảng dánh sách
     */
    @Override
    public void addTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
       Teacher teacher=infoTeacher();
       teacherList.add(teacher);
        WriteFileUtil.writeTeacherFile(PATH,teacherList);
    }

    /**
     * phương thức xóa giảng viên
     */
    @Override
    public void remoTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
        System.out.println("nhập vào id học sinh cần xóa: ");
        int idRemove = Integer.parseInt(SCANNER.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    WriteFileUtil.writeTeacherFile(PATH,teacherList);
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
    public void displayAllTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getInfo());
        }
    }

    @Override
    public void findTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
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
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == idFind) {
                    System.out.println(teacher);
                    isFlag = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String nameFind = SCANNER.nextLine();
            for (Teacher teacher : teacherList) {
                if (teacher.getName().toLowerCase().contains(nameFind)) {
                    System.out.println(teacher);
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
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
        boolean nextTip = true;
        for (int i = 0; i < teacherList.size() - 1 && nextTip; i++) {
            nextTip = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    nextTip = true;
                }
            }
        }
        WriteFileUtil.writeTeacherFile(PATH,teacherList);
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


    public static Teacher infoTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readTeacgerFile(PATH);
        int id;
        while (true) {
            try {

                System.out.print("Nhập id: ");
                id = Integer.parseInt(SCANNER.nextLine());
                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id) {
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

       String name=formatName();

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

        System.out.println("nhập vào chuyên môn");
        String specialize = SCANNER.nextLine();

        System.out.println("thêm giáo viên thành công:");
        Teacher teacher=new Teacher(id,name,dayOfBirth,gender,specialize);
        return teacher;
    }


}
