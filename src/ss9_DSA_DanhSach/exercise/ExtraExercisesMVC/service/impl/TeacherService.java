package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.DuplicateIDException;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils.WriteFileUtil;

import java.io.IOException;
import java.util.*;

public class TeacherService implements ITeacherService {
    private static final String PATH = "src/ss9_DSA_DanhSach/exercise/ExtraExercisesMVC/file/teacher2.txt";
    private static Scanner sc = new Scanner(System.in);


    List<Teacher> teacherList;

    {
        try {
            teacherList = ReadFileUtil.readTeacgerFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * phương thức để thêm thành viên cho mảng dánh sách
     */
    @Override
    public void addTeacher() throws IOException {
        int id = 0;
        while (true) {
            try {

                System.out.print("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
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
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập vào chuyên môn");
        String specialize = sc.nextLine();
        System.out.println("thêm giáo viên thành công:");
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        teacherList.add(teacher);
        WriteFileUtil.writeTeacherFile(PATH,teacherList);
    }

    /**
     * phương thức xóa giảng viên
     */
    @Override
    public void remoTeacher() throws IOException {
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
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getInfo());
        }
    }

    @Override
    public void findTeacher() {
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
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == idFind) {
                    System.out.println(teacher);
                    isFlag = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String nameFind = sc.nextLine();
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
    public void bubbleSort() {
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
    }


}
