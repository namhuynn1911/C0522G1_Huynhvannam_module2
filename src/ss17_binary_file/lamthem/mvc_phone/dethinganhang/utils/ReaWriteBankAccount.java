package ss17_binary_file.lamthem.mvc_phone.dethinganhang.utils;

import ss17_binary_file.lamthem.mvc_phone.dethinganhang.model.Bank;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.model.PaymentAccount;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReaWriteBankAccount {
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

    public static List<Bank> readBank(String path) {
        List<String> strings = readFiles(path);
        List<Bank> bankList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 8) {
                bankList.add(new SavingAccount(Integer.parseInt(info[0]), info[1], info[2], info[3],
                        Integer.parseInt(info[4]), info[5], info[6], info[7]));
            } else if (info.length == 6) {
                bankList.add(new PaymentAccount(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5]));
            }
        }
        return bankList;
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
    public static void writeBankFile(String path, List<Bank> bankList) {
        String data = "";
        for (Bank bank : bankList) {
            data += bank.getInfo();
        }
        writeFile(path, data);
    }
}
