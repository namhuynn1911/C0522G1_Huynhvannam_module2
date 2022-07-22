package ss16_io_text_file.exercise.country.utils;

import ss16_io_text_file.exercise.country.model.Country;

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
public static List<Country> readCountryFile(String path) throws IOException {
        List<String> stringList=readFile(path);
        List<Country> list=new ArrayList<>();
        String[] info;
        for (String line:stringList) {
            info= line.split(",");
            list.add(new Country(Integer.parseInt(info[0]),info[1],info[2]));
        }
        return list;
}
}
