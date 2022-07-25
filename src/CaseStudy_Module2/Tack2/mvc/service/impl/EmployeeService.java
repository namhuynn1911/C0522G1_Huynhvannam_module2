package CaseStudy_Module2.Tack2.mvc.service.impl;

import CaseStudy_Module2.Tack2.mvc.model.Employee;
import CaseStudy_Module2.Tack2.mvc.service.IEmployeeService;
import CaseStudy_Module2.Tack2.mvc.utils.ReadFileUtil;
import CaseStudy_Module2.Tack2.mvc.utils.WriteFileUtil;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private  static final String PATH="src/CaseStudy_Module2/Tack2/mvc/data/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void writeEmployee() throws IOException {
        WriteFileUtil.writeEmployeeFile(PATH,employeeList);
    }
    public void readEmployee() throws IOException {
        List<Employee> list = ReadFileUtil.readEmployeeFile(PATH);
        employeeList.clear();
        employeeList.addAll(list);
    }

    @Override
    public void displayEployee() throws IOException {
        readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEployee() throws IOException {
        readEmployee();
        Employee employee = infoEmployee();
        employeeList.add(employee);
        writeEmployee();
        System.out.println("thêm thành công");
    }

    public static Employee infoEmployee() {
        System.out.println("nhập vào mã nhân viên");
        String code = scanner.nextLine();

        System.out.println("nhập vào tên nhân viên ");
        String name = scanner.nextLine();

        System.out.println("nhập vào ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.println("nhập vào giới tính ");
        String gender = scanner.nextLine();

        System.out.println("nhập vào id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập vào số điệnt thoại ");
        int numberPhone = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập vào email ");
        String email = scanner.nextLine();

        System.out.println("nhập vào chức vụ");
        String position = scanner.nextLine();

        System.out.println("nhập vào lương nhân viên ");
        int salary = Integer.parseInt(scanner.nextLine());

        System.out.println("chọn trình độ ");
        Employee employee = new Employee();
        int choose;
        do {
            System.out.println("TRÌNH ĐỘ \n" +
                    "1. Trung cấp \n" +
                    "2. Cao đẳng \n" +
                    "3. Đại học \n" +
                    "4. Sau đại học \n");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employee.setAcademicLevel("trung cấp");
                    break;
                case 2:
                    employee.setAcademicLevel("cao đẳng");
                    break;
                case 3:
                    employee.setAcademicLevel("đại học");
                    break;
                case 4:
                    employee.setAcademicLevel("sau đại học");
                    break;

            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        return new Employee(code, name, dateOfBirth, gender, id, numberPhone,
                email, employee.getAcademicLevel(), position, salary);
    }
}
