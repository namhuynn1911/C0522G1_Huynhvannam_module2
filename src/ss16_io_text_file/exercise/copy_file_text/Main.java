package ss16_io_text_file.exercise.copy_file_text;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/ss16_io_text_file/exercise/copy_file_text/file_data/input.text");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder temp = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                temp.append(line).append('\n');
            }
            temp.delete(temp.length() - 2, temp.length());
            bufferedReader.close();

            File file1 = new File("src/ss16_io_text_file/exercise/copy_file_text/file_data/output.text");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            bufferedWriter.write(temp.toString());
            System.out.println("số lượng ksi tự được chuyển qua : "+temp.length());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
