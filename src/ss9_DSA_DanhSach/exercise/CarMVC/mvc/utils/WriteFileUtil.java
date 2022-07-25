package ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils;





import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.Oto;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeMay;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeTai;

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

    public static void writeOtoFile(String path, List<Oto> otos) throws IOException {
        String data="";
        for (Oto oto:otos) {
            data +=oto.getInfo();
        }
        writeFile(path,data);
    }
    public static void writeXeTaiFile(String path, List<XeTai> xeTais) throws IOException {
        String data="";
        for (XeTai xeTai:xeTais) {
            data +=xeTai.getInfo();
        }
        writeFile(path,data);
    }
    public static void writeXeMayFile(String path, List<XeMay> xeMays) throws IOException {
        String data="";
        for (XeMay xeMay:xeMays) {
            data +=xeMay.getInfo();
        }
        writeFile(path,data);
    }
}
