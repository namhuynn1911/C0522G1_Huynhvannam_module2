package ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils;



import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.Oto;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeMay;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeTai;

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
    public static List<Oto> readOtoFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List <Oto> list=new ArrayList();
        String[] info;
        for (String line:stringList) {
            info=line.split(",");
            list.add(new Oto(info[0],info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),
                    Integer.parseInt(info[4]),info[5]));
        }
        return list;
    }

    public static List<XeTai> readXeTaiFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List <XeTai> list=new ArrayList();
        String[] info;
        for (String line:stringList) {
            info=line.split(",");
            list.add(new XeTai(info[0],info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),
                    Double.parseDouble(info[4])));
        }
        return list;
    }

    public static List<XeMay> readXeMayFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List <XeMay> list=new ArrayList();
        String[] info;
        for (String line:stringList) {
            info=line.split(",");
            list.add(new XeMay(info[0],info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),Double.parseDouble(info[4])));
        }
        return list;
    }
}
