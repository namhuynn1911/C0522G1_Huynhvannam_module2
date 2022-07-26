package CaseStudy_Module2.Tack2.mvc.utils;

import CaseStudy_Module2.Tack2.mvc.model.Customer;
import CaseStudy_Module2.Tack2.mvc.model.Employee;
import ss16_io_text_file.practice.demo_copy_file_text.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> stringList = new ArrayList<>();
        //bufferedReader.readLine();loại bỏ dòng tiêu đề
        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }
        bufferedReader.close();
        return stringList;
    }

    public static List<Employee> readEmployeeFile(String path) throws IOException {
        List<String> stringList = readFile(path);
        List<Employee> list = new ArrayList();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            list.add(new Employee(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]),
                    info[6], info[7], info[8], Double.parseDouble(info[9])));
        }
        return list;
    }

    public static List<Customer> readCustomerFile(String path) throws IOException {
        List<String> stringList = readFile(path);
        List<Customer> list = new ArrayList();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            list.add(new Customer(info[0],info[1],info[2],info[3],Integer.parseInt(info[4]),Integer.parseInt(info[5]),
                    info[6],info[7],info[8]));
        }
        return list;
    }
}
