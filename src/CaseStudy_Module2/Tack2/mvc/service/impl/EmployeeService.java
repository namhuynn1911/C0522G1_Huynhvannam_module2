package CaseStudy_Module2.Tack2.mvc.service.impl;

import CaseStudy_Module2.Tack2.mvc.exception.AreaInvalidException;
import CaseStudy_Module2.Tack2.mvc.exception.DuplicateIDException;
import CaseStudy_Module2.Tack2.mvc.model.Employee;
import CaseStudy_Module2.Tack2.mvc.service.IEmployeeService;
import CaseStudy_Module2.Tack2.mvc.utils.ReadFileUtil;
import CaseStudy_Module2.Tack2.mvc.utils.WriteFileUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/CaseStudy_Module2/Tack2/mvc/data/employee.csv";
    private static final Scanner SCANNER = new Scanner(System.in);


    @Override
    public void displayEployee() {
        List<Employee> employeeList = ReadFileUtil.readEmployeeFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEployee() {
        List<Employee> employeeList = ReadFileUtil.readEmployeeFile(PATH);
        Employee employee = infoEmployee();
        employeeList.add(employee);
        WriteFileUtil.writeEmployeeFile(PATH, employeeList);
        System.out.println("thêm thành công");
    }

    @Override
    public void editEmployee() {
        List<Employee> employeeList = ReadFileUtil.readEmployeeFile(PATH);
        displayEployee();
        System.out.println("nhập mã nhân viên để chỉnh sữa: ");
        String code = SCANNER.nextLine();
        boolean flag = false;

        for (Employee employee : employeeList) {
            if (employee.getCode().equals(code)) {
                flag = true;
                employee.setName(formatName());

                System.out.println("nhập vào năm sinh cần thay đổi: ");
                employee.setDateOfBirth(SCANNER.nextLine());

                System.out.println("nhập vào giới tính: ");
                employee.setEged(SCANNER.nextLine());

                System.out.println("nhập vào id: ");
                employee.setId(Integer.parseInt(SCANNER.nextLine()));


                System.out.println("nhập vào email: ");
                employee.setEmail(SCANNER.nextLine());

                System.out.println("nhập vào chức vụ: ");
                employee.setPosition(SCANNER.nextLine());

                System.out.println("nhập vào lương: ");
                employee.setSalary(Integer.parseInt(SCANNER.nextLine()));

                employee.setAcademicLevel(getAcademicLevel());
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy nhân viên này");
        }
        WriteFileUtil.writeEmployeeFile(PATH, employeeList);
    }


    public static Employee infoEmployee() {
        List<Employee> employeeList = ReadFileUtil.readEmployeeFile(PATH);
        String code;
        int id;
        String numberPhone;
        int salary;
        String email;
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

        String name = formatName();

        String dateOfBirth =getDateOfBirth();

        System.out.println("nhập vào giới tính ");
        String gender = SCANNER.nextLine();

        while (true) {
            try {
                System.out.println("nhập vào id");
                id = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số");
            }
        }

        while (true) {
            System.out.println("nhập vào số điệnt thoại ");
            numberPhone = SCANNER.nextLine();
            if (numberPhone.matches("[0]\\d{9}")) {
                break;
            } else {
                System.out.println("sai định dạng, định dang theo [0YYYY.. Y] chạy từ [0-9] có 9 chữ số");
            }
        }

        while (true) {
            System.out.println("nhập vào email ");
            email = SCANNER.nextLine();
            if(email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$")) {
                break;
            }else {
                System.out.println("bạn nhập sai định dạng,XXX@YYY.NNN trong đó XX là kí tự ngậu nhiên,YY là kuws tự ít nhất");
            }
        }


        System.out.println("nhập vào chức vụ");
        String position = SCANNER.nextLine();

        while (true) {
            try {

                System.out.println("nhập vào lương nhân viên ");
                salary = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn phải nhập số");
            }
        }

        //chọn trình độ
        String academicLevel = getAcademicLevel();

        return new Employee(code, name, dateOfBirth, gender, id, numberPhone,
                email, academicLevel, position, salary);
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh khách hàng: ");
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                    throw new AreaInvalidException("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }
                return dateOfBirth;
            }catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String getAcademicLevel() {
        System.out.println("chọn trình độ: \n" +
                "1. Trung cấp \n" +
                "2. Cao đẳng \n" +
                "3. Đại học \n" +
                "4. Sau đại học ");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
            switch (choose) {
                case 1:
                    return "trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "đại học";
                case 4:
                    return "sau đại học";
                default:
                    System.out.println("lựa chọn không hợp lệ ,mời bạn nhập lại");
            }

        } while (true);
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
}
