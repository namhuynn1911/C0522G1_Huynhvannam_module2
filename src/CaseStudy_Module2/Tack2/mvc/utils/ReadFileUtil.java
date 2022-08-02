package CaseStudy_Module2.Tack2.mvc.utils;

import CaseStudy_Module2.Tack2.mvc.model.Customer;
import CaseStudy_Module2.Tack2.mvc.model.Employee;
import CaseStudy_Module2.Tack2.mvc.model.Facility;
import CaseStudy_Module2.Tack2.mvc.model.Villa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFileUtil {
    private static List<String> readFile(String path) {
        List<String> stringList = new LinkedList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //bufferedReader.readLine();loại bỏ dòng tiêu đề
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> readEmployeeFile(String path) {
        List<String> stringList = readFile(path);
        List<Employee> list = new ArrayList();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            list.add(new Employee(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), info[5],
                    info[6], info[7], info[8], Double.parseDouble(info[9])));
        }
        return list;
    }

    public static List<Customer> readCustomerFile(String path) {
        List<String> stringList = readFile(path);
        List<Customer> customerList = new ArrayList();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            customerList.add(new Customer(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), info[5],
                    info[6], info[7], info[8]));
        }
        return customerList;
    }
}
