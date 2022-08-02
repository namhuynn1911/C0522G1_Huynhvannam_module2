package ss17_binary_file.lamthem.mvc_phone.utils;

import ss17_binary_file.lamthem.mvc_phone.model.DienThoaiChinhHang;
import ss17_binary_file.lamthem.mvc_phone.model.DienThoaiXachTay;
import ss17_binary_file.lamthem.mvc_phone.model.Dienthoai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteDienThoai {
        private static List<String> readFiles(String path) {
            List<String> stringList = new ArrayList<>();
            String line;
            try {
                File file = new File(path);
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    stringList.add(line);
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringList;

        }

        public static List<Dienthoai> readDienThoai(String path) {
            List<String> strings = readFiles(path);
            List<Dienthoai> dienThoaiList = new ArrayList<>();
            String[] info;
            for (String line : strings) {
                info = line.split(",");
                if (info.length == 7 && (info[6].equals("Toàn quốc")||info[6].equals("Quốc tế"))) {
                    dienThoaiList.add(new DienThoaiChinhHang(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]),
                            Integer.parseInt(info[3]), info[4],Integer.parseInt(info[5]), info[6]));
                } else if (info.length == 7&&(info[6].equals("Đã sửa chữa")||info[6].equals("Chưa sữa chữa"))) {
                    dienThoaiList.add(new DienThoaiXachTay(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]),
                            Integer.parseInt(info[3]), info[4], info[5],info[6]));
                }
            }
            return dienThoaiList;
        }

        private static void writeFile(String path, String data) {
            try {
                File file = new File(path);
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void writeDienThoaiFile(String path, List<Dienthoai> dienthoaiList) {
            String data = "";
            for (Dienthoai dienthoai : dienthoaiList) {
                data += dienthoai.getInfo();
            }
            writeFile(path, data);
        }
    }
