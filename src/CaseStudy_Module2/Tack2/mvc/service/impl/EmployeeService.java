package CaseStudy_Module2.Tack2.mvc.service.impl;

import CaseStudy_Module2.Tack2.mvc.exception.DuplicateIDException;
import CaseStudy_Module2.Tack2.mvc.model.Employee;
import CaseStudy_Module2.Tack2.mvc.service.IEmployeeService;
import CaseStudy_Module2.Tack2.mvc.utils.ReadFileUtil;
import CaseStudy_Module2.Tack2.mvc.utils.WriteFileUtil;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/CaseStudy_Module2/Tack2/mvc/data/employee.csv";
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    public void writeEmployee() throws IOException {
        WriteFileUtil.writeEmployeeFile(PATH, employeeList);
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

    @Override
    public void editEmployee() {
        try {
            readEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }
            System.out.println("nhập mã nhân viên để chỉnh sữa: ");
            String code = SCANNER.nextLine();
            boolean flag = false;

            for (Employee employee : employeeList) {
                if (employee.getCode().equals(code)) {
                    flag = true;
                    System.out.println("nhập vào tên nhân viên cần sửa: ");
                    employee.setName(SCANNER.nextLine());

                    System.out.println("nhập vào năm sinh cần thay đổi: ");
                    employee.setDateOfBirth(SCANNER.nextLine());

                    System.out.println("nhập vào giới tính: ");
                    employee.setEged(SCANNER.nextLine());

                    System.out.println("nhập vào id: ");
                    employee.setId(Integer.parseInt(SCANNER.nextLine()));

                    System.out.println("nhập vào số điện thoại: ");
                    employee.setNumberPhone(Integer.parseInt(SCANNER.nextLine()));

                    System.out.println("nhập vào email: ");
                    employee.setEmail(SCANNER.nextLine());

                    System.out.println("nhập vào chức vụ: ");
                    employee.setPosition(SCANNER.nextLine());

                    System.out.println("nhập vào lương: ");
                    employee.setSalary(Integer.parseInt(SCANNER.nextLine()));

                    System.out.println("chọn trình độ ");
                    int choose;
                    do {
                        System.out.println("TRÌNH ĐỘ \n" +
                                "1. Trung cấp \n" +
                                "2. Cao đẳng \n" +
                                "3. Đại học \n" +
                                "4. Sau đại học \n");
                        choose = Integer.parseInt(SCANNER.nextLine());
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
                }
            }
            if (!flag) {
                System.out.println("không tìm thấy nhân viên này");
            }
        try {
            writeEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee infoEmployee() {
        String code;
        while (true) {
            try {
                System.out.println("nhập vào mã nhân viên");
                code = SCANNER.nextLine();
                for (Employee employee : employeeList) {
                    if (employee.getCode().equals(code)) {
                        throw new DuplicateIDException("mã bị trùng yêu cầu nhập lại");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("nhập vào tên nhân viên ");
        String name = SCANNER.nextLine();

        System.out.println("nhập vào ngày tháng năm sinh");
        String dateOfBirth = SCANNER.nextLine();

        System.out.println("nhập vào giới tính ");
        String gender = SCANNER.nextLine();

        System.out.println("nhập vào id");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("nhập vào số điệnt thoại ");
        int numberPhone = Integer.parseInt(SCANNER.nextLine());

        System.out.println("nhập vào email ");
        String email = SCANNER.nextLine();

        System.out.println("nhập vào chức vụ");
        String position = SCANNER.nextLine();

        System.out.println("nhập vào lương nhân viên ");
        int salary = Integer.parseInt(SCANNER.nextLine());

        System.out.println("chọn trình độ ");
        Employee employee = new Employee();
        int choose;
        do {
            System.out.println("TRÌNH ĐỘ \n" +
                    "1. Trung cấp \n" +
                    "2. Cao đẳng \n" +
                    "3. Đại học \n" +
                    "4. Sau đại học \n");
            choose = Integer.parseInt(SCANNER.nextLine());
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
