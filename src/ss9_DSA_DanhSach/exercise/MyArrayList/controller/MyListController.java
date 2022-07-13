package ss9_DSA_DanhSach.exercise.MyArrayList.controller;

import ss9_DSA_DanhSach.exercise.MyArrayList.model.Student;
import ss9_DSA_DanhSach.exercise.MyArrayList.service.impl.StudentService;

import java.util.Scanner;

public class MyListController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);


        StudentService<Student> newMyArrayList = new StudentService<Student>(3);
        newMyArrayList.ensureCapacity(4);


        newMyArrayList.add(new Student(1, "huỳnh văn nam"));
        newMyArrayList.add(new Student(2, "nguyên tấn huân"));
        newMyArrayList.add(new Student(3, "Bùi Hùng"));
        newMyArrayList.add(new Student(4, "Nguyễn Tất Thành"));
        newMyArrayList.add(new Student(5, "Nguyễn Văn PHúc"));
        newMyArrayList.add(new Student(6, "Nguyễn Văn B"));

//
        newMyArrayList.remove(1);
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).toString());
        }
        System.out.println();
        System.out.println("phần tử tại vị trí 2 :" + newMyArrayList.get(2));
        System.out.println("số lượng phần tử của mảng :" + newMyArrayList.size());

        StudentService<Student> studentService2 = newMyArrayList.clone();
        for (int i = 0; i < studentService2.size(); i++) {
            System.out.println(studentService2.get(i).toString());

        }
    }
}
