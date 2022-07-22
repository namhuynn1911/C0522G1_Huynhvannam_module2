package ss16_io_text_file.practice.demo_copy_file_text.service.impl;

import ss16_io_text_file.practice.demo_copy_file_text.model.Student;
import ss16_io_text_file.practice.demo_copy_file_text.service.IStudentService;
import ss16_io_text_file.practice.demo_copy_file_text.utils.ReadFileUtil;
import ss16_io_text_file.practice.demo_copy_file_text.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final String PATH="src/ss16_io_text_file/exercise/copy_file_text/file/student.txt";
    List<Student> students;

    {
        try {
            students = ReadFileUtil.readStudentFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public  void add() throws IOException {
//đọc dữ liệu file

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào id :");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào name :");
        String name= scanner.nextLine();
        System.out.println("nhập vào score :");
        double score= Double.parseDouble(scanner.nextLine());
        Student s =new Student(id,name,score);
        students.add(s);

        //add xuống lại file
        WriteFileUtil.writeStudentFile(PATH,students);
    }

    @Override
    public void display() {
        for (Student student:students){
            System.out.println(student.getInfo());
        }
    }
}
