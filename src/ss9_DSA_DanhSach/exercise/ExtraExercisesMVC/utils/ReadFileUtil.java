package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils;



import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file=new File(path);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        List<String> stringList=new ArrayList<>();
        //bufferedReader.readLine();loại bỏ dòng tiêu đề
        while ((line=bufferedReader.readLine())!=null) {
            stringList.add(line);
        }
        bufferedReader.close();
        return stringList;
    }
    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List <Student> list=new ArrayList();
        String[] info;
        for (String line:stringList) {
            info=line.split(",");
            list.add(new Student(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4],Double.parseDouble(info[5])));
        }
        return list;
    }

    public static List<Teacher> readTeacgerFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List <Teacher> list=new ArrayList();
        String[] info;
        for (String line:stringList) {
            info=line.split(",");
            list.add(new Teacher(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]));
        }
        return list;
    }
}
