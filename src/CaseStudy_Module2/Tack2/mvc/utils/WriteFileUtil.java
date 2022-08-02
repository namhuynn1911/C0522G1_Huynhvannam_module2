package CaseStudy_Module2.Tack2.mvc.utils;


import CaseStudy_Module2.Tack2.mvc.model.Customer;
import CaseStudy_Module2.Tack2.mvc.model.Employee;
import CaseStudy_Module2.Tack2.mvc.model.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFileUtil {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployeeFile(String path, List<Employee> employees) {
        String data = "";
        for (Employee employee : employees) {
            data += employee.getInfo();
        }
        writeFile(path, data);
    }

    public static void writeCustomerFile(String path, List<Customer> customerList) {
        String data = "";
        for (Customer customer : customerList) {
            data += customer.getInfo();
        }
        writeFile(path, data);
    }

    }

