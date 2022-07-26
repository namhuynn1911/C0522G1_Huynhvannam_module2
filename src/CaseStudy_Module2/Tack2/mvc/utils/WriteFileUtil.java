package CaseStudy_Module2.Tack2.mvc.utils;


import CaseStudy_Module2.Tack2.mvc.model.Customer;
import CaseStudy_Module2.Tack2.mvc.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    private static void writeFile(String path,String data) throws IOException {
        File file=new File(path);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeEmployeeFile(String path, List<Employee> employees) throws IOException {
        String data="";
        for (Employee employee:employees) {
            data +=employee.getInfo();
        }
        writeFile(path,data);
    }

    public static void writeCustomerFile(String path, List<Customer> customerList) throws IOException {
        String data="";
        for (Customer customer:customerList) {
            data +=customer.getInfo();
        }
        writeFile(path,data);
    }

}
