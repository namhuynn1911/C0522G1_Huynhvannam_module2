package ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.utils;



import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Student;
import ss9_DSA_DanhSach.exercise.ExtraExercisesMVC.model.Teacher;

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

    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data="";
        for (Student student:students) {
            data +=student.getInfo();
        }
        writeFile(path,data);
    }

    public static void writeTeacherFile(String path, List<Teacher> teachers) throws IOException {
        String data="";
        for (Teacher teacher:teachers) {
            data +=teacher.getInfo();
        }
        writeFile(path,data);
    }
}
