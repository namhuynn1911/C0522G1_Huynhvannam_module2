package CaseStudy_Module2.Tack2.mvc.service.impl;

import CaseStudy_Module2.Tack2.mvc.model.Customer;
import CaseStudy_Module2.Tack2.mvc.service.ICustomerService;
import CaseStudy_Module2.Tack2.mvc.utils.ReadFileUtil;
import CaseStudy_Module2.Tack2.mvc.utils.WriteFileUtil;


import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String PATH = "src/CaseStudy_Module2/Tack2/mvc/data/customer.csv";
    private static final Scanner SCANNER = new Scanner(System.in);


    @Override
    public void displayCustomer() {
            List<Customer> customerList = ReadFileUtil.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {

            List<Customer> customerList = ReadFileUtil.readCustomerFile(PATH);

        Customer customer = infoCustomer();
        customerList.add(customer);

            WriteFileUtil.writeCustomerFile(PATH, customerList);
        System.out.println("thêm thành công");
    }

    @Override
    public void editCustomer(){
            List<Customer> customerList = ReadFileUtil.readCustomerFile(PATH);
        System.out.println("nhập vào id cần chỉnh sửa: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println("nhập vào mã khách hàng cần sửa :");
                customer.setCode(SCANNER.nextLine());

                System.out.println("nhập vào tên nhân viên cần sửa: ");
                customer.setName(SCANNER.nextLine());

                System.out.println("nhập vào năm sinh cần thay đổi: ");
                customer.setDateOfBirth(SCANNER.nextLine());

                System.out.println("nhập vào giới tính: ");
                customer.setEged(SCANNER.nextLine());

                System.out.println("nhập vào id: ");
                customer.setId(Integer.parseInt(SCANNER.nextLine()));

                while (true) {
                    System.out.println("nhập vào số điện thoại: ");
                    String phone=SCANNER.nextLine();
                    if(phone.matches("[0]\\d{9}")) {
                        customer.setNumberPhone(phone);
                        break;
                    }else {
                        System.out.println("bạn đã nhập sai định dạng.yêu cầu nhập lại");
                    }
                }

                System.out.println("nhập vào email: ");
                customer.setEmail(SCANNER.nextLine());

                System.out.println("nhập vào loại khách hàng cần sửa: ");
                customer.setCustomerType(SCANNER.nextLine());

                System.out.println("nhập vào địa chỉ sửa : ");
                customer.setAddress(SCANNER.nextLine());
                break;
            }
                System.out.println("không tìm thấy nhân viên này");
        }

            WriteFileUtil.writeCustomerFile(PATH, customerList);
    }

    public static Customer infoCustomer() {
        System.out.println("nhập vào mã khách hàng");
        String code = SCANNER.nextLine();

        System.out.println("nhập vào tên khách hàng ");
        String name = SCANNER.nextLine();

        System.out.println("nhập vào ngày tháng năm sinh");
        String dateOfBirth = SCANNER.nextLine();

        System.out.println("nhập vào giới tính ");
        String gender = SCANNER.nextLine();

        System.out.println("nhập vào id");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("nhập vào số điệnt thoại ");
        String numberPhone = SCANNER.nextLine();

        System.out.println("nhập vào email ");
        String email = SCANNER.nextLine();

        System.out.println("nhập vào loại khách hàng");
        String customerType = SCANNER.nextLine();

        System.out.println("nhập vào địa chỉ khách hàng ");
        String address = SCANNER.nextLine();


        return new Customer(code, name, dateOfBirth, gender, id, numberPhone,
                email, customerType, address);
    }
}
