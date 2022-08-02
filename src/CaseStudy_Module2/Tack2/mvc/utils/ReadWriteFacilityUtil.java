package CaseStudy_Module2.Tack2.mvc.utils;

import CaseStudy_Module2.Tack2.mvc.model.Facility;
import CaseStudy_Module2.Tack2.mvc.model.House;
import CaseStudy_Module2.Tack2.mvc.model.Room;
import CaseStudy_Module2.Tack2.mvc.model.Villa;

import java.io.*;
import java.util.*;

public class ReadWriteFacilityUtil {
    private static List<String> readFiles(String path) {
        List<String> strings = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static Map<Facility, Integer> readFacilities(String path) {
        List<String> strings = readFiles(path);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 10) {
                facilityIntegerMap.put(new Villa(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]),
                        info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8])), Integer.parseInt(info[9]));
            } else if (info.length == 9) {
                facilityIntegerMap.put(new House(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]),
                        info[5], info[6], Integer.parseInt(info[7])), Integer.parseInt(info[8]));
            } else if (info.length == 8) {
                facilityIntegerMap.put(new Room(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]),
                        info[5], info[6]), Integer.parseInt(info[7]));
            }
        }
        return facilityIntegerMap;
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

    public static void writeFileFacility(String path, Map<Facility, Integer> facilityIntegerMap) {
        String data ="";
        Set<Facility> facilities = facilityIntegerMap.keySet();

        for (Facility key : facilities) {
            if (key instanceof Villa) {
                data +=key.getInfo()+","+facilityIntegerMap.get(key)+"\n";
            } else if (key instanceof House) {
                data +=key.getInfo()+","+facilityIntegerMap.get(key)+"\n";
            } else if (key instanceof Room) {
                data +=key.getInfo()+","+facilityIntegerMap.get(key)+"\n";
            }
        }
        writeFile(path, data.substring(0, data.length() - 1));
    }
}
