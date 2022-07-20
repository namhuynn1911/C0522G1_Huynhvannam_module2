package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.impl;

import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.service.ITeacherService;

import java.util.*;

public class TeacherService implements ITeacherService {
    private static final List<Teacher> teacherList = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    static {
        teacherList.add(new Teacher(1, "lê thị vân anh", "20/11/1993", "nữ", "toán"));
        teacherList.add(new Teacher(2, "nguyễn thị kiều trinh", "20/11/1997", "nữ", "lý"));
        teacherList.add(new Teacher(3, "huỳnh thị hiền", "20/11/1997", "nữ", "hóa"));
        teacherList.add(new Teacher(4, "võ thị mỹ ngân", "20/11/1993", "nữ", "sinh"));
    }

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

    /**
     * phương thức để cho người dùng nhập thông tin
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
